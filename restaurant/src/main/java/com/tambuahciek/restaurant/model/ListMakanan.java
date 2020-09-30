package com.tambuahciek.restaurant.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

//@Data
//
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ListMakanan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    @Column(name = "nama")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "harga")
    private int harga;

//    public ListMakanan() {
//    }
//
//    public ListMakanan(long id, String title, String description, String harga) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//        this.harga = harga;
//    }
//
//    @Override
//    public String toString() {
//        return "ListMakanan{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", description='" + description + '\'' +
//                ", harga='" + harga + '\'' +
//                '}';
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
