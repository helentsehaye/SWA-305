package web_shop.Customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import web_shop.Customer.dto.CustomerDto;
import web_shop.Customer.service.impl.CustomerService;

import java.util.List;

@RestController
@RequestMapping( "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping("/get/{id}")
    public CustomerDto getCustomer(@PathVariable Long id){
       return customerService.getCustomer(id);
    }
    @GetMapping( "/list")
    public List<CustomerDto> getCustomers(){
        return customerService.getCustomers();
    }
    @PostMapping( "/create")
    public void createCustomer(CustomerDto customerDto){
        customerService.createCustomer(customerDto);
    }
    @PutMapping("/update/{id}")
    public CustomerDto updateCustomer(@PathVariable Long id , CustomerDto customerDto){
        return customerService.updateCustomer(id,customerDto);
    }

















}
