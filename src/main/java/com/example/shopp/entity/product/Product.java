package com.example.shopp.entity.product;

import com.example.shopp.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Entity(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity {

    @Column(nullable = false)
    @NonNull
    @NotBlank(message = "Product name cannot be empty or null")
    private String name;

    private String description;

    @Column(nullable = false)
    @NonNull
    @Positive
    private Double price;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;

}
