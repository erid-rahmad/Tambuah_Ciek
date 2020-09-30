package com.tambuahciek.restaurant.controller;

import com.tambuahciek.restaurant.model.ListMakanan;
import com.tambuahciek.restaurant.model.Makanan;
import com.tambuahciek.restaurant.repository.RepositoryListMakanan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/listmakanan")
public class ControlListMakanan {

    @Autowired
    RepositoryListMakanan repositoryListMakanan;

    @GetMapping("/all")
    public List<ListMakanan> getAll() {
        return repositoryListMakanan.findAll();
    }

    @GetMapping("/all/{id}")
    public Optional<ListMakanan> findOne(@PathVariable("id") long id){
        Optional<ListMakanan> findone = repositoryListMakanan.findById(id);
        return findone;
    }

    @PostMapping("/all")
    public String tambahsatu(@RequestBody ListMakanan tambah){
        repositoryListMakanan.save(tambah);
        return "alah";
    }

    @PutMapping("/all/{id}")
    public ResponseEntity<ListMakanan> update(@RequestBody ListMakanan update, @PathVariable long id){
        Optional<ListMakanan> model = repositoryListMakanan.findById(id);
        if (!model.isPresent()){
            return ResponseEntity.notFound().build();
        }
        update.setId(id);
        repositoryListMakanan.save(update);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/all/{id}")
    public String deletbyid(@PathVariable ("id") long id){
        Optional<ListMakanan> buku = repositoryListMakanan.findById(id);
        String result ="";
        if(buku == null){
            result = "id "+ id +" tidak di temukann";
            return result;
        }
        repositoryListMakanan.deleteById(id);
        result = "id "+ id +" di temukann";
        return result;
    }


}
