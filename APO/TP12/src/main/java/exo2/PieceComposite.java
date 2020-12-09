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
public abstract class PieceComposite extends Piece {
    protected ArrayList<Piece> liste;
    
    public PieceComposite(String nom, String reference){
        super(nom, reference);
        liste = new ArrayList<>();
    }
    
    public void ajoute(Piece p){
        liste.add(p);
    }

    @Override
    public String toString() {
        return "nom : " + getNom() +  "\n" +"reference : " + getReference() + "\n";
    }
    
    public int dureeGarantieDeBase(){
        int duree = liste.get(0).dureeGarantie();
        for(int i = 0; i < liste.size(); i++){
            if(duree > liste.get(i).dureeGarantie()){
                duree = liste.get(i).dureeGarantie();
            }
        }
        return duree;
    }
    
    public int dureeFabrication(){
        int duree = liste.get(0).dureeFabrication();
        for(int i = 0; i < liste.size(); i++){
            if(duree < liste.get(i).dureeFabrication()){
                duree = liste.get(i).dureeFabrication();
            }
        }
        
        return duree;
    }
    
}
