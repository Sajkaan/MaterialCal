package com.sajkaan.service;

import com.sajkaan.model.Part;
import com.sajkaan.model.Trailer;
import com.sajkaan.repository.TrailerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrailerServiceImpl implements TrailerService {

    @Autowired
    private TrailerRepository trailerRepository;

    @Override
    public Iterable<Trailer> findAll() {
        return trailerRepository.findAll();
    }

    @Override
    public Trailer findOne(Long id) {
        return trailerRepository.findOne(id);
    }

    @Override
    public void save(Trailer trailer) {
        trailerRepository.save(trailer);
    }
}
