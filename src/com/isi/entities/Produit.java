package com.isi.entities;

public class Produit {
    //definition des attributs
    private String ref;
    private String libP;
    private Categorie categorie;
    // definition constructeurs
    public Produit() {
    }

    public Produit(String ref, String libP, Categorie categorie) {
        this.ref = ref;
        this.libP = libP;
        this.categorie = categorie;
    }
    // definition setters et getters
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibP() {
        return libP;
    }

    public void setLibP(String libP) {
        this.libP = libP;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
