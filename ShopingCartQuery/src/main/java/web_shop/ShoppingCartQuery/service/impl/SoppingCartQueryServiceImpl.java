package web_shop.ShoppingCartQuery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web_shop.ShoppingCartQuery.domain.Product;
import web_shop.ShoppingCartQuery.dto.ProductDto;
import web_shop.ShoppingCartQuery.repository.ShoppingCartQueryRepo;
import web_shop.ShoppingCartQuery.service.SoppingCartQueryService;

import java.util.List;

@Service
public class SoppingCartQueryServiceImpl implements SoppingCartQueryService {

    @Autowired
    ShoppingCartQueryRepo shoppingCartQueryRepo;

    @Override
    public void updateProduct(ProductDto productDto, Long Id) {

    }
//    @Override
//    public List<ProductDto> getShoppingCart() {
//        return ;
//    }
    public void addProduct(ProductDto dto){

    }


}
