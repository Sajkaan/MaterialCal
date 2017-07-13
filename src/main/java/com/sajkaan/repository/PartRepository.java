package com.sajkaan.repository;

import com.sajkaan.model.Part;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface PartRepository {

    void save(Part part);
}
