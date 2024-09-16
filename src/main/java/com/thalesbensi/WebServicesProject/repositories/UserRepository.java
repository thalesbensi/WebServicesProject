package com.thalesbensi.WebServicesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thalesbensi.WebServicesProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
}
