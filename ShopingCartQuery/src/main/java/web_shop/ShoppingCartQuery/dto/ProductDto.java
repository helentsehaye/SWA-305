package web_shop.ShoppingCartQuery.dto;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    @Id
    private long customerId;

    private String productNumber;

    private String name;

    private double price;

    private String description;
}
