/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP04;
import java.lang.*;



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
        // Déclaration
        Point p1;
        Point p2;
        Segment s1;
        
        //Instanciation
        p1 = new Point();
        p2 = new Point();
        s1 = new Segment();
        //Initialisation
        p1.x = 0.0;
        p1.y= 0.0;
        
        p2.x = 5.0;
        p2.y = 5.0;
        
        s1.a = p1;
        s1.b = p2;
        
        //Calcul de la longeur du segment
        double longueur;
        longueur = Math.sqrt(Math.pow(s1.b.x - s1.a.x,2) + Math.pow(s1.b.y - s1.a.y, 2));
        System.out.println("Longueur du segment :");
        System.out.println(longueur);
    }
    
}
