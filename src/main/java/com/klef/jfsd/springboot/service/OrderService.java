package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Order;

@Service
public interface OrderService 
{
	  public String addOrder(Order o);
	  public List<Order> displayAllOrders(); 
	  
}
