package web_shop.ShoppingCartQuery.domain;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private long customerId;

    private String productNumber;

    private String name;

    private double price;

    private String description;
}
