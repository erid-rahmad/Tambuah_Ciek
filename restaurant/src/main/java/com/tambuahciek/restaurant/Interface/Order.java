package com.tambuahciek.restaurant.Interface;

import com.tambuahciek.restaurant.model.Makanan;
import com.tambuahciek.restaurant.model.Pembeli;

import java.util.List;

public interface Order {
    public List<Makanan> listOrderanById(int idpembeli);
    public List<Pembeli> listpembelidanproduk();
    public String createorder(Pembeli pembeli);
}
