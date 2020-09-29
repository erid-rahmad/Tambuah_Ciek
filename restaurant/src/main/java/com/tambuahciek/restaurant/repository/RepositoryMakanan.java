package com.tambuahciek.restaurant.repository;

import com.tambuahciek.restaurant.model.Makanan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryMakanan extends JpaRepository<Makanan,Long> {
}
