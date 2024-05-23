package umc_ch6.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc_ch6.spring.domain.mapping.CategoryRestaurant;
import umc_ch6.spring.domain.mapping.UserCategory;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;

    @OneToMany(mappedBy = "category")
    private List<CategoryRestaurant> categoryRestaurantList = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<UserCategory> userCategoryList = new ArrayList<>();
}
