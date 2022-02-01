package com.ayush.cms.service;
import com.ayush.cms.dao.CustomerDAO;
import com.ayush.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;
@Component
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;
    public Customer addCustomer(Customer customer) {
        return customerDAO.save(customer);
    }
    public List<Customer> getCustomers() {
        return customerDAO.findAll();
    }
    public Customer getCustomer(int customerId) {
        return customerDAO.findById(customerId).get();
    }
    public Customer updateCustomer(int customerId, Customer customer) {
        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }
    public void deleteCustomer(int customerId) {
        customerDAO.deleteById(customerId);
    }
}