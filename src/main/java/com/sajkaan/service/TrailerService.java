package com.sajkaan.service;

import com.sajkaan.model.Trailer;

import java.util.List;

public interface TrailerService {

    List<Trailer> findAll();

    Trailer findById(Long id);

    void save(Trailer trailer);

    void delete(Trailer trailer);
}
