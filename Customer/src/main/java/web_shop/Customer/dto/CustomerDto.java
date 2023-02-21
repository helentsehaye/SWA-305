package web_shop.Customer.dto;

import lombok.*;
import web_shop.Customer.domain.Address;
import web_shop.Customer.domain.Contact;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private String firstName;

    private String lastName;

    private Address address;

    private Contact contact;
}
