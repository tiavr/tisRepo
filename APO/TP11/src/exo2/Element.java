/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

/**
 *
 * @author phantomr
 */
public class Element {
    private int valeur;
    private Element suivant;
    
    public Element(){
        valeur = 0;
        suivant = null;
    }
    
    public Element(int valeur){
        this.valeur = valeur;
    }

    /**
     * @return the valeur
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /**
     * @return the suivant
     */
    public Element getSuivant() {
        return suivant;
    }

    /**
     * @param suivant the suivant to set
     */
    public void setSuivant(Element suivant) {
        this.suivant = suivant;
    }
}
