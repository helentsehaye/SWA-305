package web_shop.Customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web_shop.Customer.dto.CustomerDto;
import web_shop.Customer.service.impl.CustomerService;

import java.util.List;

@RestController
@RequestMapping(name = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerDto getCustomer(Long id){
       return customerService.getCustomer(id);
    }

    public List<CustomerDto> getCustomers(){
        return customerService.getCustomers();
    }

    public void createCustomer(CustomerDto customerDto){
        customerService.createCustomer(customerDto);
    }

    public CustomerDto updateCustomer(Long id , CustomerDto customerDto){
        return customerService.updateCustomer(id,customerDto);
    }

















}
