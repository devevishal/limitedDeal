package com.myapp.todo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.todo.Repository.DealRepo;


@Service
public class DealService {

	@Autowired
	DealRepo dealRepo;
	
	
	
	
}
