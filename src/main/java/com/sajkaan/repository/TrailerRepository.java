package com.sajkaan.repository;

import com.sajkaan.model.Trailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrailerRepository extends CrudRepository<Trailer, Long>{
}
