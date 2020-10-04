package com.tambuahciek.restaurant.Interface;

import com.tambuahciek.restaurant.model.Makanan;

import java.util.List;

public interface Order {
    public List<Makanan> getall(int idpembeli);
}
