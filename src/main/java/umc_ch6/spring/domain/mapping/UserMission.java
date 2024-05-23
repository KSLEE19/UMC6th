package umc_ch6.spring.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc_ch6.spring.domain.Member;
import umc_ch6.spring.domain.Mission;
import umc_ch6.spring.domain.enums.MemberStatus;

import java.sql.Time;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserMission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    private MemberStatus state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;

    private Time deadline;

}
