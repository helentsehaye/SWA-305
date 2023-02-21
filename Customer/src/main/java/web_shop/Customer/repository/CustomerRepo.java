package web_shop.Customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web_shop.Customer.domain.Customer;
@Repository
public interface CustomerRepo extends MongoRepository<Customer,Long> {
}
