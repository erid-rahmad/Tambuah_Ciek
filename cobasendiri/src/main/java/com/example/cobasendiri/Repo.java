package com.example.cobasendiri;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface Repo extends JpaRepository<Model,Long> {
    @Override
    Model getOne(Long aLong);

    @Override
    Optional<Model> findById(Long aLong);
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          