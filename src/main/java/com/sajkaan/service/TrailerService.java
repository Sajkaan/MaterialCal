package com.sajkaan.service;

import com.sajkaan.model.Trailer;

public interface TrailerService {
    Iterable<Trailer> findAll();
    Trailer findOne(Long id);
    void save(Trailer trailer);
}
