package com.sajkaan.repository;

import com.sajkaan.model.Part;

import java.util.List;


public interface PartRepository {

    List<Part> findAll();

    Part findById(Long id);

    void save(Part part);

    void delete(Part part);
}
