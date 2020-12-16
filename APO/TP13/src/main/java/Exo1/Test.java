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
public class Test {
 
    public static void main(String[] args) {
        Evaluable [] tablo1 = new Evaluable[5];
        tablo1[0] = new Eleve("Elodie",17.5);
        tablo1[1] = new Voiture("Ford Focus", 8500);
        tablo1[2] = new Eleve("Marion", 19.5);
        tablo1[3]= new Voiture("Renault Clio", 7300);
        tablo1[4] = new Eleve("Benoit",18.5);
 
        Statistiques s = new Statistiques(tablo1);
        s.afficherValeurs();
        System.out.println("min : " + s.min().valeur());
        System.out.println("max : " + s.max().valeur());
        System.out.println("moyenne : " + s.moyenne());
        System.out.println("variance : " + s.variance());
    }
}