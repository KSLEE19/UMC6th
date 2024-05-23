package umc_ch6.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc_ch6.spring.domain.mapping.UserMission;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String contents;

    private Long reward;

    @OneToMany(mappedBy = "mission")
    private List<UserMission> userMissionList = new ArrayList<>();

}
