package web_shop.ShoppingCartQuery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web_shop.ShoppingCartQuery.domain.ShoppingCartQuery;

@Repository

public interface ShoppingCartQueryRepo extends MongoRepository<ShoppingCartQuery, Long> {



}
