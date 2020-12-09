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
public class PieceCompositeKit extends PieceComposite{
    protected int duree_montage;
    
    public PieceCompositeKit(String nom, String reference, int duree_montage){
        super(nom, reference);
        this.duree_montage = duree_montage;
    }
    
    public double prix(){
        double prix = 0;
        for(Piece p : liste){
            prix += p.prix();
        }
        return prix;
    }
    
    public int dureeGarantie(){
        int dureeG = dureeGarantieDeBase() / 2;
        return dureeG;
    }

    @Override
    public String toString() {
        String text = "";
        for(int i = 0; i < liste.size(); i++){
            text += liste.get(i).getNom() + " - " + liste.get(i).getReference() + "\n";
        }
        return text;
    }
    
    
    public void afficher(){
        String text = "nom : " + getNom() + "\n" + "référence : " + getReference() + "\n" + "prix : " + prix() + "\n" + "garantie : " + dureeGarantie() + "mois" + "\ndurée de fabrication : " + dureeFabrication() + "jour(s)" + "\ndurée de montage particulier : " + duree_montage + "mn \n" + "composants : \n";
        String kit = toString();
        String comp = "";
        for(int i = 0; i < liste.size(); i++){
            if(liste.get(i).getReference().substring(0 ,2).equals("01")){
                System.out.println(text + kit + "     " + liste.get(i).getNom() + " - " + liste.get(i).getReference() + "\n");
            }
            else{
                comp = "    " + liste.get(i).getNom() + " - " + liste.get(i).getReference() + "\n";
            }
            kit += comp;
        }
    }
}
