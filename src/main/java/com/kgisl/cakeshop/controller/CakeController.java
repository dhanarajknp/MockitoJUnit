package com.kgisl.cakeshop.controller;

import java.util.List;

import com.kgisl.cakeshop.model.Cake;
import com.kgisl.cakeshop.repository.CakeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/**
 * CakeController
 */
public class CakeController {

    @Autowired
    private CakeRepository cakeRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Cake create(@RequestBody Cake cake) {
        cake.setId(0);
        return cakeRepository.saveAndFlush(cake);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Cake update(@PathVariable Integer id, @RequestBody Cake updatedcake) {
        Cake cake = cakeRepository.getOne(id);
        cake.setSugar(updatedcake.getSugar());
        return cakeRepository.saveAndFlush(cake);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Cake> read() {
        return cakeRepository.findAll();

    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Integer id) {
        cakeRepository.deleteById(id);
    }
}