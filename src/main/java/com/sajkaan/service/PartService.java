package com.sajkaan.service;

import com.sajkaan.model.Part;

import java.util.List;

public interface PartService  {
    List<Part> findAll();
    Part findOne(Long id);
    void save(Part part);
}
