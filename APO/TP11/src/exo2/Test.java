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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Element a;
        a = new Element();
        System.out.println("valeur de l'élément a : " + a.getValeur());
        a.setValeur(8);
        System.out.println("valeur de l'élément a : " + a.getValeur());

        Element b;
        b = new Element();
        b.setValeur(6);

        Liste liste = new Liste();
        liste.ajouterDebut(a);
        liste.ajouterDebut(b);
    }
    
}
