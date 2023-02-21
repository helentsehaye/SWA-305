package web_shop.Customer.service;

import web_shop.Customer.dto.CustomerDto;

import java.util.List;

public interface CustomerServiceInterface {

    public CustomerDto getCustomer(Long id);
    public List<CustomerDto> getCustomers();
    public void createCustomer(CustomerDto customerDTO);
   // public CustomerDto updateCustomer(long customerNumber, CustomerDto customerDTO);
    public void deleteCustomer(Long customerNumber);
}
