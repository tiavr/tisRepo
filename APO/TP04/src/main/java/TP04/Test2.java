/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP04;

/**
 *
 * @author tiavr
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declarations
        Point p0;
        Point p1;
        Point p2;
        Segment s1;
        Segment s2;
        Rectangle r;
        // Instanciations
        p0 = new Point();
        p1 = new Point();
        p2 = new Point();
        
        s1 = new Segment();
        s2 = new Segment();
        
        r = new Rectangle();
        //Initialisations
        p0.x = 0.0;
        p0.y = 0.0;
        
        p1.x = 2.0;
        p1.y = 0.0;
        
        p2.x =0.0;
        p2.y = 1.0;
        
        s1.a = p0;
        s1.b = p1;
        
        s2.a = p0;
        s2.b = p1;
        
        r.v1 = s1;
        r.v2 = s2;
        
        double longueur1;
        double longueur2;
        
        longueur1 = Math.sqrt(Math.pow(r.v1.b.x - r.v1.a.x, 2) + Math.pow(r.v1.b.y - r.v1.a.y,2));
        longueur2 = Math.sqrt(Math.pow(r.v2.b.x - r.v2.a.x, 2) + Math.pow(r.v2.b.y - r.v2.a.y,2));
        
        double aire;
        aire = longueur1 * longueur2;
        
        System.out.println("Aire du rectangle :");
        System.out.println(aire);
        
        
    }
    
}
