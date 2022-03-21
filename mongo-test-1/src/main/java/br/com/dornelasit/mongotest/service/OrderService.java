package br.com.dornelasit.mongotest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import br.com.dornelasit.mongotest.document.OrderDocument;
import br.com.dornelasit.mongotest.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public void saveOrder(@NonNull OrderDocument order) {
		this.repository.save(order);
	}
	
}
