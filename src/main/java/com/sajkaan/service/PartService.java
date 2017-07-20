package com.sajkaan.service;

import com.sajkaan.model.Part;

import java.util.List;

public interface PartService  {

    List<Part> findAll();

    Part findById(Long id);

    void save(Part part);

    void delete(Part part);
}
