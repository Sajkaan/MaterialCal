package com.sajkaan.repository;

import com.sajkaan.model.Trailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrailerRepository {

    List<Trailer> findAll();

    Trailer findById(Long id);

    void save(Trailer trailer);

    void delete(Trailer trailer);
}
