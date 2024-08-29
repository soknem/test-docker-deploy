package mogo.database.test1.mapper;

import mogo.database.test1.domain.Product;
import mogo.database.test1.feature.product.dto.ProductRequest;
import mogo.database.test1.feature.product.dto.ProductResponse;
import mogo.database.test1.feature.product.dto.ProductUpdateRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product fromRequest(ProductRequest videoRequest);

    ProductResponse toResponse(Product video);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateProductFromRequest(@MappingTarget Product product, ProductUpdateRequest productUpdateRequest);

}
