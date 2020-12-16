/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;

/**
 *
 * @author tiavr
 */
public class Voiture implements Evaluable{
    private String nom;
    private double prix;
    
    public Voiture(String nom, double prix){
        this.nom = nom;
        this.prix = prix;
    }
    
    public double valeur(){
        return prix;
    }

    @Override
    public String toString() {
        return "nom=" + nom + ", prix=" + prix;
    }
    
}
