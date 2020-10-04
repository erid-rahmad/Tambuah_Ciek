package com.tambuahciek.restaurant.Implement;
import com.tambuahciek.restaurant.Interface.Order;
import com.tambuahciek.restaurant.model.Makanan;
import com.tambuahciek.restaurant.repository.RepositoryMakanan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplementOrder implements Order {

    @Autowired
    RepositoryMakanan repositoryMakanan;

    @Override
    public List<Makanan>  getall(int idpembeli) {
        Makanan makanan;
        List<Makanan> listbyid = repositoryMakanan.listorderbypembeli(idpembeli);
        System.out.println(listbyid);
//        List<Integer> harga =makanan.getHarga(listbyid);
//        System.out.println(harga);
        int x =0;
        for (Makanan _makanan: listbyid){
//            x = _makanan.getHarga();
            System.out.println(x);
            x+=_makanan.getHarga();
        }
        System.out.println(x);
        return listbyid;
    }
}
