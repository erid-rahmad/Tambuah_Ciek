package com.tambuahciek.restaurant.Implement;

import com.tambuahciek.restaurant.model.Pembeli;
import lombok.Data;

import java.time.LocalDate;


public class OrderRequesImplement {

    LocalDate localDate = LocalDate.now();

    private Pembeli pembeli;


    public OrderRequesImplement() {


    }

    public void setdate(){
        pembeli.setDate(localDate);
    }

    public OrderRequesImplement(Pembeli pembeli) {
        this.pembeli = pembeli;


    }

    @Override
    public String toString() {
        return "OrderReques{" +
                "pembeli=" + pembeli +
                '}';
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }
}
