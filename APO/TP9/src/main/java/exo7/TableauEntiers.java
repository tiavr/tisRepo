/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo7;

/**
 *
 * @author tiavr
 */
public class TableauEntiers {
    private int [] T;
     
    public TableauEntiers(int taille, int min, int max) {
        int i;
        T = new int[taille];
        for(i=0;i<T.length;i++)
            T[i] = Outils.nombreAleatoire(min, max);
    }
 
    public void affichage(){
        int i;
        String s="";
        for(i=0;i<T.length;i++)
            s = s + T[i] + " ";
        System.out.println(s);
    }
    
    public int positionMinimum(int debut){
        int pos_min = debut;
        for(int j = debut + 1; j < T.length; ++j){
            if(T[j] < T[pos_min]){
                pos_min = j;
            }
        }
        return pos_min;
    }
    
    public void echanger(int i, int j){
        int temp;
        temp = T[i];
        T[i] = T[j];
        T[j] = temp;
    }
    
    public void triSelection(){
        int k, pos_min;
        for(k = 1; k < T.length; ++k){
            pos_min = positionMinimum(k-1); 
            echanger(k-1, pos_min);
        }
    }
}
