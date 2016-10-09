package com.cobalt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cobalt.domain.CustomerBuilder;
import com.cobalt.domain.CustomerResult;
import com.cobalt.service.Customer;
import com.cobalt.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	 
	@RequestMapping("/customers/{id}")
	public CustomerResult findById(@PathVariable("id") long id) {
		Customer result = customerService.findOne(id);

		return new CustomerBuilder().setId(result.getId())
				.setFirstName(result.getFirstName())
				.setLastName(result.getLastName())
				.build();
	}
	
	@RequestMapping("/customers")
	public List<CustomerResult> findAllCustomers() {
		List<Customer> customers = customerService.findByAll();
		
		List<CustomerResult> results = new ArrayList<>();
		for (Customer current : customers) {
			results.add(new CustomerBuilder().setCustomer(current).build());
		}
		return results;
	}
}
