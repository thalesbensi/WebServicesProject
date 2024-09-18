package com.thalesbensi.WebServicesProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thalesbensi.WebServicesProject.entities.Product;
import com.thalesbensi.WebServicesProject.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findbyId(Long Id) {
		Optional<Product> obj = repository.findById(Id);
		return obj.get();
	}
	
}
