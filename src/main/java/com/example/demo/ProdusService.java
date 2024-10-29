package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdusService {
    private final ProdusRepository produsRepository;

    @Autowired
    public ProdusService(ProdusRepository produsRepository) {
        this.produsRepository = produsRepository;
    }

    public List<Produs> getAllProduse() {
        return produsRepository.findAll();
    }

    public void addProdus(Produs produs) {
        produsRepository.save(produs);
    }

    public Optional<Produs> getProdus(Long id) {
        return produsRepository.findById(id);
    }

    public void updateProdus(Long id, Produs produs) {
        produs.setId(id); // Set the ID to ensure it's updated correctly
        produsRepository.save(produs);
    }

    public void deleteProdus(Long id) {
        produsRepository.deleteById(id);
    }
}
