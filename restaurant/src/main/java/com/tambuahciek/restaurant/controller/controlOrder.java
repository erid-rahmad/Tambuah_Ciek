package com.tambuahciek.restaurant.controller;

import com.tambuahciek.restaurant.Implement.OrderRequesImplement;
import com.tambuahciek.restaurant.Interface.Order;
import com.tambuahciek.restaurant.model.Makanan;
import com.tambuahciek.restaurant.model.Pembeli;
import com.tambuahciek.restaurant.repository.RepositiryPembeli;
import com.tambuahciek.restaurant.repository.RepositoryMakanan;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/order")
public class controlOrder {

    public Logger log = LogManager.getLogger(getClass());

    @Autowired
    Order order;

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

    @GetMapping("/idpembeli/{idpembeli}")
    public List<Makanan> listyangdibeli(@PathVariable ("idpembeli") int idpembeli ){
        return order.getall(idpembeli);
    }

    @GetMapping("/order")
    public List<Pembeli> finnallorder(){
        return repositiryPembeli.findAll();
    }

    @GetMapping("/idpembeliharga/{idpembeli}")
    public List<?> haga(@PathVariable ("idpembeli") int idpembeli){
        return repositoryMakanan.listorderbyharga(idpembeli);
    }

}
