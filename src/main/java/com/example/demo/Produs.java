package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nume;
    private int gramaj;
    private float pret;

    // Constructors, getters, setters

    public Produs() {}

    public Produs(String nume, int gramaj, float pret) {
        this.nume = nume;
        this.gramaj = gramaj;
        this.pret = pret;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}
