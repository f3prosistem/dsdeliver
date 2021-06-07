package com.f3pro.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.f3pro.dsdeliver.dto.OrderDTO;
import com.f3pro.dsdeliver.etities.Order;
import com.f3pro.dsdeliver.repositorie.OrderRepository;

@Service
public class OrderService {
	
	
	@Autowired
	private OrderRepository repository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findOrdersWithProducts();
		
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
	
}