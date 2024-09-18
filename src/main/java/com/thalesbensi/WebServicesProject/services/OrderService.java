package com.thalesbensi.WebServicesProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thalesbensi.WebServicesProject.entities.Order;
import com.thalesbensi.WebServicesProject.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findbyId(Long Id) {
		Optional<Order> obj = repository.findById(Id);
		return obj.get();
	}
	
}
