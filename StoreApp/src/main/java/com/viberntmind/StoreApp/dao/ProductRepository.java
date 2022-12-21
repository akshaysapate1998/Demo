package com.viberntmind.StoreApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viberntmind.StoreApp.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
