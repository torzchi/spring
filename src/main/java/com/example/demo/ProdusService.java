package com.example.demo;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdusService {
    private final List<Produs> produse = new ArrayList<>();



    @PostConstruct
    public void init() {
        produse.add(new Produs("prod1", 100, 19.99f));
        produse.add(new Produs("Ppod2", 200, 29.99f));
        produse.add(new Produs("prod existent", 150, 39.99f));
    }


    public List<Produs> getAllProduse() {
        return produse;
    }

    public void addProdus(Produs produs) {
        produse.add(produs);
    }

    public Produs getProdus(int index) {
        return produse.get(index);
    }

    public void updateProdus(int index, Produs produs) {
        produse.set(index, produs);
    }

    public void deleteProdus(int index) {
        produse.remove(index);
    }
}

