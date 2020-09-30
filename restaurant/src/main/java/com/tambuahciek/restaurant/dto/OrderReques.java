package com.tambuahciek.restaurant.dto;

import com.tambuahciek.restaurant.model.Pembeli;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class OrderReques {

    private Pembeli pembeli;

    public OrderReques() {
    }

    public OrderReques(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    @Override
    public String toString() {
        return "OrderReques{" +
                "pembeli=" + pembeli +
                '}';
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }
}
