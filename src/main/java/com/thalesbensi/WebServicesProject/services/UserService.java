package com.thalesbensi.WebServicesProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thalesbensi.WebServicesProject.entities.User;
import com.thalesbensi.WebServicesProject.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findbyId(Long Id) {
		Optional<User> obj = repository.findById(Id);
		return obj.get();
	}
	
}
