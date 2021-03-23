package com.isi.controller;

import com.isi.entities.Categorie;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.awt.*;
import java.util.Scanner;

public class ICategorieImpl implements ICategorie {
    Scanner scan = new Scanner(System.in);
    @Override
    public Categorie saisie() {
        Categorie c = new Categorie();
        System.out.println("Entrer l'id");
        int id = Integer.parseInt(scan.nextLine());
        c.setIdC(id);
        System.out.println("Entrer le libelle");
        String lib = scan.nextLine();
        c.setLibC(lib);

        return c;
    }

    @Override
    public void affichage(Categorie c) {
        System.out.println("L'identifiant est : " + c.getIdC());
        System.out.println("Le Libelle est : " + c.getLibC());
    }
}
