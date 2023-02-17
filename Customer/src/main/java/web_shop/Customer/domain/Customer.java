package web_shop.Customer.domain;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private long customerId;

    private String firstName;

    private String lastName;

    private Address address;

    private Contact contact;

}
