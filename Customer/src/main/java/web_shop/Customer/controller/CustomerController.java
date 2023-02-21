package web_shop.Customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web_shop.Customer.service.impl.CustomerService;

@RestController
@RequestMapping(name = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


}
