package com.tambuahciek.restaurant.Implement;
import com.tambuahciek.restaurant.Interface.Order;
import com.tambuahciek.restaurant.model.Makanan;
import com.tambuahciek.restaurant.model.Pembeli;
import com.tambuahciek.restaurant.repository.RepositoryPembeli;
import com.tambuahciek.restaurant.repository.RepositoryMakanan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class ImplementOrder implements Order {

    @Autowired
    RepositoryMakanan repositoryMakanan;

    @Autowired
    RepositoryPembeli repositoryPembeli;

    LocalDate localDate = LocalDate.now();

    Makanan makanan;
    Pembeli pembeli;

    @Override
    public List<Makanan> listOrderanById(int idpembeli) {

        List<Makanan> listbyid = repositoryMakanan.listorderbypembeli(idpembeli);
        System.out.println(listbyid);

        //count total tagihan
        int totaltagihan =0;
        for (Makanan _makanan: listbyid){
//            x = _makanan.getHarga();
            System.out.println(totaltagihan);
            totaltagihan+=_makanan.getHarga();
        }
        System.out.println(totaltagihan);
        long id =idpembeli;
        Pembeli pembeli = repositoryPembeli.getOne(id);
        pembeli.setTagihan(totaltagihan);
        repositoryPembeli.save(pembeli);
        return listbyid;
    }

    @Override
    public List<Pembeli> listpembelidanproduk() {

        return repositoryPembeli.findAll();
    }

    @Override
    public String createorder(Pembeli pembelibaru) {
        pembelibaru.setDate(localDate);
        repositoryPembeli.save(pembelibaru);
        return "alun";
    }


}
