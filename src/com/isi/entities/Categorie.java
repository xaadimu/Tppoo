package com.isi.entities;

public class Categorie {
    // definition des attributs
    private int idC;
    private String libC;

    // definitions des constructeurs
    public Categorie(){}
    public Categorie (int idC, String libC){
        this.idC = idC;
        this.libC = libC;
    }

    // definitions des methodes (getters et setters)
    public int getIdC() {
        return this.idC;
    }

    public String getLibC() {
        return this.libC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public void setLibC(String libC) {
        this.libC = libC;
    }
}
