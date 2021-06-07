package com.f3pro.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.f3pro.dsdeliver.dto.OrderDTO;
import com.f3pro.dsdeliver.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
    @Autowired
    private OrderService  services;

    @GetMapping
    public ResponseEntity<List<OrderDTO>> findAll() {

        List<OrderDTO> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }
}
