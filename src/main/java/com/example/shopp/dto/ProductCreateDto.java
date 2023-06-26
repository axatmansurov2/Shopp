package com.example.shopp.dto;

import com.example.shopp.entity.product.ProductCategory;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCreateDto {

    private String name;

    private String description;

    private Double price;

    private ProductCategory category;
}
