package web_shop.ShoppingCartQuery.service;


import web_shop.ShoppingCartQuery.dto.ProductDto;

import java.util.List;

public interface SoppingCartQueryService {

//    public List<ProductDto> getShoppingCart();
    public void updateProduct(ProductDto productDto,Long Id);

}
