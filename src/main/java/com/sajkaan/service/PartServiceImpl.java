package com.sajkaan.service;

import com.sajkaan.model.Part;
import com.sajkaan.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class PartServiceImpl implements PartService {

    @Autowired
    private PartRepository partRepository;

    @Override
    public Iterable<Part> findAll() {
        return partRepository.findAll();
    }

    @Override
    public Part findOne(Long id) {
        return partRepository.findOne(id);
    }

    @Override
    public void save(Part part) {
        partRepository.save(part);
    }
}
