package posologie;

import posologie.*;

public class Posologie {
    private String categorie, forme;
    private int quantite, frequence;

    public Posologie(String categorie, String forme, int quantite, int frequence) {
        this.categorie = categorie;
        this.forme = forme;
        this.quantite = quantite;
        this.frequence = frequence;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getForme() {
        return forme;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getFrequence() {
        return frequence;
    }
    
    
}
