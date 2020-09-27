package com.example.cobasendiri;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Model")

public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "pinjam")
    private String siapaminjam;

    @Column(name = "published")
    private boolean published;

    @Column(name = "jumlahbuku")
    private int jumlahbuku;

    @Column(name = "hargabuku")
    private int hargabuku;

//    @Column(nullable = false,updatable = false)
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date update;


    private LocalDate tanggal;

    private LocalDate tanngalbalik;

    public Model() {

    }

    public Model(long id, String title, String description, String siapaminjam, boolean published, Date update) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.siapaminjam = siapaminjam;
        this.published = published;
        this.update = update;
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

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    public String getSiapaminjam() {
        return siapaminjam;
    }

    public void setSiapaminjam(String siapaminjam) {
        this.siapaminjam = siapaminjam;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public int getJumlahbuku() {
        return jumlahbuku;
    }

    public void setJumlahbuku(int jumlahbuku) {
        this.jumlahbuku = jumlahbuku;
    }

    public int getHargabuku() {
        return hargabuku;
    }

    public void setHargabuku(int hargabuku) {
        this.hargabuku = hargabuku;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public LocalDate getTanngalbalik() {
        return tanngalbalik;
    }

    public void setTanngalbalik(LocalDate tanngalbalik) {
        this.tanngalbalik = tanngalbalik;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", siapaminjam='" + siapaminjam + '\'' +
                ", published=" + published +
                ", update=" + update +
                '}';
    }
}
