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
public class DessinateurFigures {
    
    private int hauteur;
    
    public DessinateurFigures(int hauteur){
        this.hauteur = hauteur;
    }
    
    public void rectangle(int largeur){
        for(int i=1; i <= hauteur; i++){
            for(int j = 1; j <= largeur; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public void triangleGauche(){
        
        for(int i = 0; i < hauteur; i++){
            for (int j = 0; j<= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    
    public void triangleDroit() {
        String s;
        for(int i = 0; i < hauteur; i++) {
            for(int j = hauteur - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }    
    }
     

    /**
     * @return the hauteur
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * @param hauteur the hauteur to set
     */
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    
    
}
