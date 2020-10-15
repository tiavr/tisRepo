/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniFacebook;

import java.util.*;

/**
 *
 * @author tiavr
 */
public class DateNaissance {
    private int jour, mois, annee;
    
    public DateNaissance(){
        this.jour = 23;
        this.mois = 06;
        this.annee = 1912;
    }
    
    public DateNaissance(int jour, int mois, int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }
    
    public int getJour(){
        return jour;
    }
    
    public int getMois(){
        return mois;
    }
    
    public int getAnnee(){
        return annee;
    }
    
    public void setJour(int jour){
        List<Integer> moisEven = Arrays.asList(4, 6, 8, 10, 12);
        if(jour > 31){
            System.out.println("Les mois ne contiennent pas plus de 31 jours");
        }
        else if(moisEven.contains(mois) && jour > 30){
            System.out.println("Il s'agit d'un mois pair, il ne contient que 30 jour.");
        }
        else if(mois == 2){
            if((annee%4 == 0 && !(annee%100 == 0)) || (annee%4 == 0 && annee%100 == 0 && annee%400 == 0)){
                if(jour > 29){
                    System.out.println("Le mois de février ne comporte pas plus de 29 jours pour l'année renseignée.");
                }
            }
            else{
                if(jour > 28){
                    System.out.println("Le moi de février ne comporte pas plus de 28 jours pour l'année renseignée");
                }
            }
        }
        else{
            this.jour = jour;
        }
        
    }
    
    public void setMois(int mois){
        if (mois < 1 || mois > 12){
            System.out.println("Le mois doit être compris entre 1 et 12");
        }
        else{
            this.mois = mois;
        }
        
    }
    public void setAnnee(int annee){
        if (annee < 0 || annee > 2015){
            System.out.println("L'année doit être positive et inférieure à 2015");
        }
        else {
            this.annee = annee;
        }
    }
    
    public void ecritDate(){
        System.out.print(jour + "/" + mois + "/" + annee + " ");
    }
    public int age(){
        int res;
        res = 2015 - annee;
        return res;
    }
}
