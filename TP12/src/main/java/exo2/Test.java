/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;
import java.util.*;
/**
 *
 * @author tiavr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Piece> l;
        l = new ArrayList<>();
        
        PieceDeBase pneu = new PieceDeBase("pneu", "004741", 12.5, 60, 2);
        PieceDeBase chambre = new PieceDeBase("chambre à air", "004565", 4.0, 20, 2);
        PieceDeBase disque = new PieceDeBase("disque à jante", "001214", 4.5, 20, 2);
        PieceDeBase rayon = new PieceDeBase("rayon", "004748", 1.0, 20, 1);
        l.add(pneu);
        l.add(chambre);
        l.add(disque);
        l.add(rayon);
        
        
        for(Piece p : l){
            p.afficher();
        }
        
        PieceCompositeKit jante = new PieceCompositeKit("jante en kit", "014541", 10);
        jante.ajoute(disque);
        jante.ajoute(rayon);
        jante.ajoute(rayon);
        jante.ajoute(rayon);
        
        jante.afficher();
        
        PieceCompositeKit roue = new PieceCompositeKit("roue de brouette en kit", "011512", 15);
        roue.ajoute(pneu);
        roue.ajoute(chambre);
        roue.ajoute(jante);
        
 
        roue.afficher();
    }
    
}
