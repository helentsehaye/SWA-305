package web_shop.Customer.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web_shop.Customer.domain.Customer;
import web_shop.Customer.dto.CustomerDto;
import web_shop.Customer.repository.CustomerRepo;
import web_shop.Customer.service.CustomerServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService implements CustomerServiceInterface {

    @Autowired
    private CustomerRepo customerRepo;
    ObjectMapper objectMapper = new ObjectMapper();

    public List<CustomerDto> getCustomers(){
        List<Customer> customers= customerRepo.findAll();

        List<CustomerDto> customerDtos = customers.stream()
                .map(x->objectMapper.convertValue(x,CustomerDto.class))
                .collect(Collectors.toList());
        return customerDtos;
    }
    public CustomerDto getCustomer(Long id){

     return objectMapper.convertValue(customerRepo.findById(id).get(),CustomerDto.class);
    }
    public void createCustomer(CustomerDto customerDto){
        customerRepo.save(objectMapper.convertValue(customerDto,Customer.class));
    }
//    public CustomerDto updateCustomer(Long id , CustomerDto customerDto){
//
//        CustomerDto customerDto1=objectMapper.convertValue(customerRepo.findById(id).get(),CustomerDto.class);
//        customerDto1 =customerDto;
//        customerRepo.save(customerDto1);
//
//        return customerDto1;
//
//    }
    public void deleteCustomer(Long id){

        customerRepo.delete(customerRepo.findById(id).get());
    }
}
