/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo4;

/**
 *
 * @author tiavr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TrinomeComplexe eq4 = new TrinomeComplexe(1.0, 1.0, 1.0);
        System.out.println("Les solutions complexes de l'équation " + eq4.equation() + " sont: " + eq4.getRacine1().texte() + " et " + eq4.getRacine2().texte());
    }
    
}
