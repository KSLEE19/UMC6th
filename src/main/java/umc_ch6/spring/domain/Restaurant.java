package umc_ch6.spring.domain;

import jakarta.annotation.ManagedBean;
import jakarta.persistence.*;
import lombok.*;
import umc_ch6.spring.domain.mapping.CategoryRestaurant;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    @OneToMany(mappedBy = "restaurant")
    private List<CategoryRestaurant> categoryRestaurantList = new ArrayList<>();

    @OneToMany(mappedBy = "restaurant")
    private List<Review> reviews = new ArrayList<>();
}
