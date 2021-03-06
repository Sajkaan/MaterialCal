package com.sajkaan.service;

import com.sajkaan.model.Part;
import com.sajkaan.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class PartServiceImpl implements PartService {

    @Autowired
    private PartRepository partRepository;


    @Override
    public List<Part> findAll() {
        return partRepository.findAll();
    }

    @Override
    public Part findById(Long id) {
        return partRepository.findById(id);
    }

    @Override
    public void save(Part part) {
        partRepository.save(part);
    }

    @Override
    public void delete(Part part) {
        partRepository.delete(part);
    }
}
