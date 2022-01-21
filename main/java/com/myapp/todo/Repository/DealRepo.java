package com.myapp.todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.todo.model.Deal;

@Repository
public interface DealRepo extends JpaRepository<Deal, Integer> {
	
	
	
	
	
}
