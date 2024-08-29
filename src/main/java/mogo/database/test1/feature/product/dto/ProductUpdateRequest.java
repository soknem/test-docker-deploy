package mogo.database.test1.feature.product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProductUpdateRequest(

        String name,

        String image,

        @Positive(message = "price is positive")
        Double price,

        String description
) {
}
