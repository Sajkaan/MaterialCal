package com.sajkaan.repository;

import com.sajkaan.model.Trailer;


import java.util.List;

public interface TrailerRepository {

    List<Trailer> findAll();

    Trailer findById(Long id);

    void save(Trailer trailer);

    void delete(Trailer trailer);
}
