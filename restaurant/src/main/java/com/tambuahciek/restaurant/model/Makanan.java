package com.tambuahciek.restaurant.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "makanan")
public class Makanan {

    @Id
    private long id;

    @Column(name = "nama")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "harga")
    private String harga;

    public Makanan() {
    }

    public Makanan(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Makanan{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", harga='" + harga + '\'' +
                '}';
    }

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

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
