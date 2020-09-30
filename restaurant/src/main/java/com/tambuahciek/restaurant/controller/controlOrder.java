package com.tambuahciek.restaurant.controller;

import com.tambuahciek.restaurant.Implement.OrderRequesImplement;
import com.tambuahciek.restaurant.model.Pembeli;
import com.tambuahciek.restaurant.repository.RepositiryPembeli;
import com.tambuahciek.restaurant.repository.RepositoryMakanan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/order")
public class controlOrder {

    @Autowired
    RepositoryMakanan repositoryMakanan;

    @Autowired
    RepositiryPembeli repositiryPembeli;
    LocalDate localDate = LocalDate.now();

    @PostMapping("/order")
    public Pembeli placeorder(@RequestBody OrderRequesImplement orderReques){
        orderReques.setdate();
        return repositiryPembeli.save(orderReques.getPembeli());
    }

    @PostMapping("/order2")
    public Pembeli placeorder(@RequestBody Pembeli pembeli){
        pembeli.setDate(localDate);
        return repositiryPembeli.save(pembeli);
    }

    @GetMapping("/order")
    public List<Pembeli> finnallorder(){
        return repositiryPembeli.findAll();
    }

}
