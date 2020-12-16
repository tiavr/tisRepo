/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;
import java.util.*;
/**
 *
 * @author tiavr
 */
public class Eleve implements Evaluable{
    private String nom;
    private double note;
    
    public Eleve(String nom, double note){
        this.nom = nom;
        this.note = note;
    }
    
    public double valeur(){
        return note;
    }

    @Override
    public String toString() {
        return "nom=" + nom + ", note=" + note;
    }
    
    
}
