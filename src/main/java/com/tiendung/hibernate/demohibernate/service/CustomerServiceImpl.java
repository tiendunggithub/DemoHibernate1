package com.tiendung.hibernate.demohibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.tiendung.hibernate.demohibernate.dao.CustomerDAO;
import com.tiendung.hibernate.demohibernate.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
    private CustomerDAO customerDAO;
	@Override
    @Transactional
    public List <Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerDAO.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {
        customerDAO.deleteCustomer(theId);
    }

}
