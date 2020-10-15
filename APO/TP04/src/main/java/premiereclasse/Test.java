/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premiereclasse;

/**
 *
 * @author tiavr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialisations
        Point p = new Point(3, 4);
        
        //Instanciations
        
        //Invocations de méthodes
        Point q = p.symmetry();
        p.affiche();
        q.affiche();
        
    }
    
}
