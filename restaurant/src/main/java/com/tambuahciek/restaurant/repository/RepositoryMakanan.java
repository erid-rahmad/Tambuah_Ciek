package com.tambuahciek.restaurant.repository;

import com.tambuahciek.restaurant.model.Makanan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositoryMakanan extends JpaRepository<Makanan,Long> {

    @Query(value = "SELECT * FROM makanan WHERE pc_fk=?1",nativeQuery = true )
    List<Makanan> listorderbypembeli(int idpembeli);

}
