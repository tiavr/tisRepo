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
public class PieceDeBase extends Piece{
    protected double prix;
    protected int duree_garantie;
    protected int duree_fabrication;
    
    public PieceDeBase(String nom, String reference, double prix, int duree_garantie, int duree_fabrication){
        super(nom, reference);
        this.prix = prix;
        this.duree_garantie = duree_garantie;
        this.duree_fabrication = duree_fabrication;
    }
    
    public void afficher(){
        System.out.println(super.toString() + "prix : " + prix + "\n" + "garantie : " + duree_garantie + "\n" + "durée de fabrication : " + duree_fabrication + " jour(s) \n");
    }
    
    public double prix(){
        return prix;
    }
    
    public int dureeGarantie(){
        return duree_garantie;
    }
    
    public int dureeGarantieDeBase(){
        return duree_garantie;
    }
    
    public int dureeFabrication(){
        return duree_fabrication;
    }
}
