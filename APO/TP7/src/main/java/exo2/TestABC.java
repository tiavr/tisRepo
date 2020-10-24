/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

/**
 *
 * @author tiavr
 */
public class TestABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TroisNombres n1 = new TroisNombres(5, 3, 1);
        n1.affiche();
        n1.diviseAparB();
        n1.lePlusGrandEntreAetB();
        n1.reordonneParOrdreCroissantABetC();
        n1.affiche();
    }
    
}
