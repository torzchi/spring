package com.example.demo;

public class Produs {
    private String nume;
    private float gramaj;
    private float pret;

    // Constructori, Getters și Setters
    public Produs() {}

    public Produs(String nume, float gramaj, float pret) {
        this.nume = nume;
        this.gramaj = gramaj;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getGramaj() {
        return gramaj;
    }

    public void setGramaj(float gramaj) {
        this.gramaj = gramaj;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}
