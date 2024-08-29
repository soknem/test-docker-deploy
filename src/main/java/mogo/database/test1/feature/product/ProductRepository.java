package mogo.database.test1.feature.product;

import mogo.database.test1.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
