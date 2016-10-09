package com.cobalt.domain;

import com.cobalt.service.Customer;

public class CustomerBuilder {
	private CustomerResult customerResult;
	
	public CustomerBuilder() {
		init();
	};
	
	private void init() {
		this.customerResult = new CustomerResult();
	}
	
	public CustomerBuilder setCustomer(Customer customer) {
		this.customerResult.setId(customer.getId());
		this.customerResult.setFirstName(customer.getFirstName());
		this.customerResult.setLastName(customer.getLastName());
		return this;
	}
	
	public CustomerBuilder setId(long id) {
		this.customerResult.setId(id);
		return this;
	}
	
	public CustomerBuilder setFirstName(String firstName) {
		this.customerResult.setFirstName(firstName);
		return this;
	}
	
	public CustomerBuilder setLastName(String lastName) {
		this.customerResult.setLastName(lastName);
		return this;
	}
	public CustomerResult build() {
		CustomerResult result = this.customerResult;
		init();
		return result;
	}

}
