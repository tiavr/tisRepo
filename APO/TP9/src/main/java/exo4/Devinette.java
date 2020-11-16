/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo4;
import java.util.*;
/**
 *
 * @author tiavr
 */
public class Devinette {
    private int nombre;
    private int min;
    private int max;

    public Devinette(int min, int max){
        if(max > 0 && min > 0 && max > min){
            this.min = min;
            this.max = max;
        }            
    }
    
    public void cheat(int nombre){
        if(nombre > min && nombre < max){
            this.nombre = nombre;
        }
        else{
            this.nombre = (min+max)/2;
        }
    }
    
    public void auHasard(){
        double valeur = min + (max - min) * Math.random();
        this.nombre = (int)valeur;
    }
    
    public Comparaison essayer(int n){
        if(n > nombre){
            Comparaison res = Comparaison.TROP_GRAND;
            return res;
        }
        if(n < nombre){
            Comparaison res = Comparaison.TROP_PETIT;
            return res;
        }
        else{
            Comparaison res = Comparaison.EGAL;
            return res;
        }
    }
    public void partieContreHumain(){
        System.out.println("entrez un entier : ");
        int j = 0;
        int i = LectureClavier.lireEntier();
        
        while(essayer(i) != Comparaison.EGAL){
            System.out.println(essayer(i).getMessage());
            System.out.println("entrez un entier : ");
            i = LectureClavier.lireEntier();
            j++;
        }
        System.out.println(essayer(i).getMessage());
        System.out.println("Il vous a fallu :" + j + " essai(s)");
    }
    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }
}
