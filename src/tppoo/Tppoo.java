package tppoo;

import com.isi.controller.ICategorie;
import com.isi.controller.ICategorieImpl;
import com.isi.entities.Categorie;

public class Tppoo {
    public static void main(String[] args) {
        ICategorie ic = new ICategorieImpl();
        Categorie c = ic.saisie();
        ic.affichage(c);
    }
}
