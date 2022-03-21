package br.com.dornelasit.mongotest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dornelasit.mongotest.document.OrderDocument;
import br.com.dornelasit.mongotest.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	@RequestMapping(value = "/order", method =  RequestMethod.POST)
    public ResponseEntity<Void> saveOrder(@Validated @RequestBody OrderDocument order){
        
		this.service.saveOrder(order);
		
		return ResponseEntity.ok().build();
    }
	
}
