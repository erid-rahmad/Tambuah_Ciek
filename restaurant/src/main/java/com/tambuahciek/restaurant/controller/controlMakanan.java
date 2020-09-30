package com.tambuahciek.restaurant.controller;

import com.tambuahciek.restaurant.dto.OrderReques;
import com.tambuahciek.restaurant.model.Makanan;
import com.tambuahciek.restaurant.model.Pembeli;
import com.tambuahciek.restaurant.repository.RepositiryPembeli;
import com.tambuahciek.restaurant.repository.RepositoryMakanan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/makanan")
public class controlMakanan {

    @Autowired
    RepositoryMakanan repo;



    @Autowired
    RepositiryPembeli repo1;

    @GetMapping("/all")
    public List<Makanan> getAll() {
        return repo.findAll();
    }

    @PostMapping("/all")
    public String tambahsatu(@RequestBody Makanan tambah){
        repo.save(tambah);
        return "goblok";
    }

    @PutMapping("/all/{id}")
    public ResponseEntity<Makanan> updateBuku(@RequestBody Makanan update, @PathVariable long id){
        Optional<Makanan> model = repo.findById(id);
        if (!model.isPresent()){
            return ResponseEntity.notFound().build();
        }
        update.setId(id);
        repo.save(update);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/all/{id}")
    public String delatBuku(@PathVariable ("id") long id){
        Optional<Makanan> buku = repo.findById(id);
        String result ="";
        if(buku == null){
            result = "id "+ id +" tidak di temukann";
            return result;
        }
        repo.deleteById(id);
        result = "id "+ id +" di temukann";
        return result;
    }

    @GetMapping("/all/{id}")
    public Optional<Makanan> findOne(@PathVariable("id") long id){
        Optional<Makanan> bukuone = repo.findById(id);
        return bukuone;
    }

    @PostMapping("/order")
    public Pembeli placeorder(@RequestBody OrderReques orderReques){
        return repo1.save(orderReques.getPembeli());

    }
    @GetMapping("/order")
    public List<Pembeli> finnallorder(){
        return repo1.findAll();
    }

}
