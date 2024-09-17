package com.thalesbensi.WebServicesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thalesbensi.WebServicesProject.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {	
}
