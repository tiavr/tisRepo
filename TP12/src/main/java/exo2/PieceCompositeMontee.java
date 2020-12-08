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
public class PieceCompositeMontee {
    protected int duree_montage;
    protected double prix_montage;
    
    public PieceCompositeMontee(String nom, String reference, int duree_montage, double prix_montage){
        //super(nom, reference);
        this.duree_montage = duree_montage;
        this.prix_montage = prix_montage;
        
    }
    
    public void prix(){
        
    }
}
