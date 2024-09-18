package com.thalesbensi.WebServicesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thalesbensi.WebServicesProject.entities.Category;
import com.thalesbensi.WebServicesProject.entities.Order;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {	
}
