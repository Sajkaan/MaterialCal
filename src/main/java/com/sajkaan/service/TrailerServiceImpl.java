package com.sajkaan.service;

import com.sajkaan.model.Trailer;
import com.sajkaan.repository.TrailerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrailerServiceImpl implements TrailerService {

    @Autowired
    private TrailerRepository trailerRepository;


    @Override
    public List<Trailer> findAll() {
        return trailerRepository.findAll();
    }

    @Override
    public Trailer findById(Long id) {
        return trailerRepository.findById(id);
    }

    @Override
    public void save(Trailer trailer) {
        trailerRepository.save(trailer);
    }

    @Override
    public void delete(Trailer trailer) {
        trailerRepository.delete(trailer);
    }
}
