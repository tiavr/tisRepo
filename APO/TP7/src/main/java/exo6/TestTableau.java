/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo6;

/**
 *
 * @author tiavr
 */
public class TestTableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tableau t1;
        t1 = new Tableau(3);
        t1.afficher();
        
        Tableau t2;
        t2 = new Tableau(2);
        t2.afficher();
        
        Tableau t3;
        t3 = new Tableau(7);
        t3.afficher();
        
        Tableau t4;
        t4 = new Tableau(5);
        t4.initialiser();
        t4.afficher();
        
    }
    
}
