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
public class SoppingCartQuery {

    @Id
    private long id;

    private String event;


}
