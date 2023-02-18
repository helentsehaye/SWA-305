package web_shop.ShoppingCartQuery.domain;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartQuery {

    @Id
    private long id;

    private String event;

    List<Product> productList= new ArrayList<>();


    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public double getTotalCost() {
        double total = 0.0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }







}
