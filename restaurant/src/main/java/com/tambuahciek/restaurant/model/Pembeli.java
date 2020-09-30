package com.tambuahciek.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
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


}
