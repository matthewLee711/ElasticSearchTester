package com.app;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

	public Customer findByFirstName(String firstName);
	
	public Customer findById(String id);

	public List<Customer> findByLastName(String lastName);

}
