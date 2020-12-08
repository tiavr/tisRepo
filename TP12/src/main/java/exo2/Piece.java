/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

/**
 *
 * @author tiavr
 */
public abstract class Piece {
    private String nom;
    private String reference;
    
    public Piece(String nom, String reference){
        this.nom = nom;
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "nom : " + getNom() + "\n"
                + "référence : " + getReference() + "\n";
        
    }
    
    public abstract void afficher();
    public abstract double prix();
    public abstract int dureeGarantie();
    public abstract int dureeGarantieDeBase();
    public abstract int dureeFabrication();

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }
       
}
