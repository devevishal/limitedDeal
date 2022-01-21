package com.myapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.todo.Repository.DealRepo;

import com.myapp.todo.model.Deal;

@RestController
@RequestMapping(path = "/LimitedTimeDeals")
public class Controller {
	
	
	@Autowired
	//DealService dealService;
	DealRepo dealRepo ; 
	
	
	
	
	
	@PostMapping("/add")
	public ResponseEntity<Object> addDeals(Deal deal){
		if(deal == null) {
			return new ResponseEntity<>( "No Deal Added ",HttpStatus.NO_CONTENT);
		}
		dealRepo.save(deal);
		return new ResponseEntity<>(dealRepo.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/getDetails/{Id}")
	public ResponseEntity<Object> getDeals(@PathVariable(value="Id") Integer Id){
		return new ResponseEntity<>( dealRepo.getById(Id),HttpStatus.OK);
	}
	
	
	
	
	
	 
	
	

}
