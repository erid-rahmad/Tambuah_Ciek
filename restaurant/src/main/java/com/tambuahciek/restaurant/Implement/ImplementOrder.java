package com.tambuahciek.restaurant.Implement;
import com.tambuahciek.restaurant.Interface.Order;
import com.tambuahciek.restaurant.model.ListMakanan;
import com.tambuahciek.restaurant.model.Makanan;
import com.tambuahciek.restaurant.model.Pembeli;
import com.tambuahciek.restaurant.repository.RepositiryPembeli;
import com.tambuahciek.restaurant.repository.RepositoryMakanan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplementOrder implements Order {

    @Autowired
    RepositoryMakanan repositoryMakanan;

    @Autowired
    RepositiryPembeli repositiryPembeli;
    Makanan makanan;
    Pembeli pembeli;

    @Override
    public List<Makanan>  getall(int idpembeli) {

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
        Pembeli pembeli = repositiryPembeli.getOne(id);

        pembeli.setTagihan(totaltagihan);
        repositiryPembeli.save(pembeli);
        return listbyid;
    }
}
