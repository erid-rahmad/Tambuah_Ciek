package com.tambuahciek.restaurant.controller;

import com.tambuahciek.restaurant.model.ListMakanan;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/login")
public class ControlAut {

    @RequestMapping("/helo")
    public String loginpage(){
        return "helow";
    }
}
