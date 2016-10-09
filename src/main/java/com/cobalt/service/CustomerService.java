package com.cobalt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;
	
	public void save(Customer customer) {
		repository.save(customer);
	}
	
	public List<Customer> findByLastName(String lastName) {
		return repository.findByLastName(lastName);
	}

	public List<Customer> findByAll() {
		return (List<Customer>) repository.findAll();
	}
	
	public Customer findOne(Long index) {
		return repository.findOne(index);
	}
}
