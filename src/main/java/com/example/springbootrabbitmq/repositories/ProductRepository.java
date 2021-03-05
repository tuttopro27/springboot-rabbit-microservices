package com.example.springbootrabbitmq.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootrabbitmq.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
