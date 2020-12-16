/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;
import java.lang.*;

/**
 *
 * @author tiavr
 */
public class Date implements Comparable{
    private int jour;
    private int mois;
    private int annee;
    
    public Date(int jour, int mois, int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }
    
    public int compareTo(Object o){
        Date nd = (Date) o;
        if(this.annee > nd.annee){
            return 1;
        }
        if(this.annee < nd.annee){
            return -1;
        }
        if(this.annee == nd.annee && this.mois > nd.mois){
            return 1;
        }
        if(this.annee == nd.annee && this.mois < nd.mois){
            return -1;
        }
        
        if(this.annee == nd.annee && this.mois == nd.mois && this.jour > nd.jour){
            return 1;
        }
        if(this.annee == nd.annee && this.mois == nd.mois && this.jour < nd.jour){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return jour +"/"+ mois + "/" + annee + "\n";
    }
    /**
     * @return the jour
     */
    public int getJour() {
        return jour;
    }

    /**
     * @return the mois
     */
    public int getMois() {
        return mois;
    }

    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }
}
