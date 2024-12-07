package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Order;
import com.klef.jfsd.springboot.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService 
{
	@Autowired
	private OrderRepository repository;
	
	@Override
	public String addOrder(Order o) {
		repository.save(o);
		return "Order Added Successfully";
	}

	@Override
	public List<Order> displayAllOrders() {
		return (List<Order>) repository.findAll();
	}

}
