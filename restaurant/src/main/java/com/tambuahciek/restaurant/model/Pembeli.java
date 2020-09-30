package com.tambuahciek.restaurant.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "pembeli")
public class Pembeli {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nama;
    private int nohp;
    private String email;
    private int tagihan;
    private String status;
    private boolean biling;

    @OneToMany(targetEntity = Makanan.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "pc_fk",referencedColumnName = "id")

    private List<Makanan> order ;

    public Pembeli() {
    }

    public Pembeli(long id, String nama, int nohp, String email, int tagihan, String status, boolean biling, List<Makanan> order) {
        this.id = id;
        this.nama = nama;
        this.nohp = nohp;
        this.email = email;
        this.tagihan = tagihan;
        this.status = status;
        this.biling = biling;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Pembeli{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", nohp=" + nohp +
                ", email='" + email + '\'' +
                ", tagihan=" + tagihan +
                ", status='" + status + '\'' +
                ", biling=" + biling +
                ", order=" + order +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNohp() {
        return nohp;
    }

    public void setNohp(int nohp) {
        this.nohp = nohp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTagihan() {
        return tagihan;
    }

    public void setTagihan(int tagihan) {
        this.tagihan = tagihan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isBiling() {
        return biling;
    }

    public void setBiling(boolean biling) {
        this.biling = biling;
    }

    public List<Makanan> getOrder() {
        return order;
    }

    public void setOrder(List<Makanan> order) {
        this.order = order;
    }
}
