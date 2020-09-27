package com.example.cobasendiri;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/buku")
public class Control {
//this basic
    @Autowired
    Repo repo;

    @GetMapping("/all")
    public List<Model> getAll() {
        return repo.findAll();
    }

    @PostMapping("/all")
    public Model tambahsatu(@RequestBody Model tambah){
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plus(2, ChronoUnit.WEEKS);
        tambah.setTanngalbalik(localDate1);
        tambah.setTanggal(localDate);
        return repo.save(tambah);

    }

    @PutMapping("/all/{id}")
    public ResponseEntity<Model> updateBuku(@RequestBody Model update,@PathVariable long id){
        Optional<Model> model = repo.findById(id);
        if (!model.isPresent()){
            return ResponseEntity.notFound().build();
        }
        update.setId(id);

        repo.save(update);

        return ResponseEntity.noContent().build();
   }

    @DeleteMapping("/all/{id}")
    public String delatBuku(@PathVariable ("id") long id){
        Optional<Model> buku = repo.findById(id);
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
    public Optional<Model> findOne(@PathVariable("id") long id){
        Optional<Model> bukuone = repo.findById(id);
        return bukuone;
    }
}
