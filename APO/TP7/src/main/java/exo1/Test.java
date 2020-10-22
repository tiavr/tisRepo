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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trinome eq1 = new Trinome(1, 1 ,1);
        int nbRac;
        nbRac = eq1.nbRacines();
        
        System.out.println("Le système : " + eq1.equation() + " n'a pas de solution");
        System.out.println("Le système : " + eq1.equation() + " a une seule solution: " + eq1.getRacine1());
        System.out.println("Le système : " + eq1.equation() + " a 2 solutions : " + eq1.getRacine1() + " et " + eq1.getRacine2());
                
    }
    
}
