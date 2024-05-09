package umc_ch6.spring.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc_ch6.spring.domain.Category;
import umc_ch6.spring.domain.Member;
import umc_ch6.spring.domain.Mission;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}
