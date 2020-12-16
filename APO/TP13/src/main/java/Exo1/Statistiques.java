/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;

/**
 *
 * @author tiavr
 */
public class Statistiques {
    private Evaluable[] tab;
    
    public Statistiques(Evaluable[] tab){
        this.tab = tab;
    }
    
    public void afficherValeurs(){
        for(int i = 0; i < tab.length; i++){
            System.out.println(tab[i].toString());
        }
    }
    
    public Evaluable min(){
        Evaluable min = tab[0];
        for(int i = 1; i < tab.length ; i++){
            if(tab[i].valeur() < min.valeur()){
                min = tab[i];
            }
        }
        return min;
    }
    
    public Evaluable max(){
        Evaluable max = tab[0];
        for(int i = 1; i < tab.length ; i++){
            if(tab[i].valeur() > max.valeur()){
                max = tab[i];
            }
        }
        return max;
    }
    
    public double moyenne(){
        double moy = 0;
        for(int i = 0; i < tab.length; i++){
            moy += tab[i].valeur();
        }
        return moy / tab.length;
    }
    
    public double variance(){
        double moy2 = 0;
        double moy = moyenne();
        for(int i = 0; i < tab.length; i++){
            moy2 += Math.pow(tab[i].valeur(), 2);
        }
        
        moy2 = moy2 / tab.length;
        
        return moy2 - Math.pow(moy, 2);
    }
}
