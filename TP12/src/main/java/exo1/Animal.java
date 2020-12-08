/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo1;

/**
 *
 * @author tiavr
 */
public abstract class Animal {
    
    private String nom;
    
    public Animal(String nom){
        this.nom = nom;
    }
    
    public String getNom(){
        return nom;
    }
    
    public abstract String cri();

    @Override
    public String toString() {
        return "Je m'appelle " + nom;
    }
    
    
    
    
}
