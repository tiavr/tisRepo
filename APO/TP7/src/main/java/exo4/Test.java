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
        DessinateurFigures dessin = new DessinateurFigures(5);
        dessin.rectangle(5);
        System.out.println("");
        dessin.triangleGauche();
        System.out.println("");
        dessin.triangleDroit();
        System.out.println("");
        dessin.triangleIso();
    }
    
}
