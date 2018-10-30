package com.kgisl.cakeshop.repository;

import java.util.List;

import com.kgisl.cakeshop.model.Cake;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CakeRepository extends JpaRepository<Cake,Integer>{   

    List<Cake> findByflour(double flour);  

    
}