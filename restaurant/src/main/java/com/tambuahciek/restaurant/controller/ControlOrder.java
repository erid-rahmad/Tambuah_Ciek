package com.tambuahciek.restaurant.controller;

import com.tambuahciek.restaurant.Implement.OrderRequesImplement;
import com.tambuahciek.restaurant.Interface.Order;
import com.tambuahciek.restaurant.model.Makanan;
import com.tambuahciek.restaurant.model.Pembeli;
import com.tambuahciek.restaurant.repository.RepositoryPembeli;
import com.tambuahciek.restaurant.repository.RepositoryMakanan;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:4200")
public class ControlOrder {

    public Logger log = LogManager.getLogger(getClass());

    @Autowired
    Order order;

    @Autowired
    RepositoryMakanan repositoryMakanan;

    @Autowired
    RepositoryPembeli repositoryPembeli;
    LocalDate localDate = LocalDate.now();

    @GetMapping("/listorder")
    public List<Pembeli> listpembelidanproduk(){
        return order.listpembelidanproduk();
    }

    @GetMapping("/listorderanbyid/{idpembeli}")
    public List<Makanan> listOrderanByid(@PathVariable ("idpembeli") int idpembeli ){
        return order.listOrderanById(idpembeli);
    }


    @PostMapping("/createorder")
    public String createorder(@RequestBody Pembeli pembelibaru){
        return order.createorder(pembelibaru);
    }

    //testing for development

    @GetMapping("/idpembeliharga/{idpembeli}")
    public List<?> haga(@PathVariable ("idpembeli") int idpembeli){
        return repositoryMakanan.listorderbyharga(idpembeli);
    }

    @PostMapping("/createorder1")
    public Pembeli createorder1(@RequestBody OrderRequesImplement orderReques){
        orderReques.setdate();
        return repositoryPembeli.save(orderReques.getPembeli());
    }

}
