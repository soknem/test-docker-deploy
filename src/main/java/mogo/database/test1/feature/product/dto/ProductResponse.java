package mogo.database.test1.feature.product.dto;

public record ProductResponse(

        String id,

        String name,

        String image,

        Double price,

        String description
) {
}
