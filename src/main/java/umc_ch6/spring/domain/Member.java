package umc_ch6.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc_ch6.spring.domain.enums.Gender;
import umc_ch6.spring.domain.enums.MemberStatus;
import umc_ch6.spring.domain.enums.SocialType;
import umc_ch6.spring.domain.mapping.UserCategory;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String address;

    private Date birth;

    private Long point;

    private String email;

    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    @OneToMany(mappedBy = "member")
    private List<UserCategory> userCategoryList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Review> reviews = new ArrayList<>();
}
