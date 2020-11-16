package exo6;
import java.util.*;
public class ManipulationTableau {

    private int[] tab;

    public ManipulationTableau(int n, int min, int max) {
        tab = new int[n];
        for(int i = 0; i < tab.length; i++){
            tab[i] = (int)Math.floor((max - min + 1) * Math.random());
        }
    }

    public void afficher(){
        System.out.println("n = " + tab.length);
        System.out.println(Arrays.toString(tab));
    }

    public int sommation() {
        int sum = 0;
        for(int valeur : tab){
            sum += valeur;
        }
        return sum;
    }

    public double moyenne(){
        double moy = sommation()/tab.length;
        return moy;
    }

    public int minimum(){
        int valueMin = tab[0];
        for(int i =0; i < tab.length; i++){
            if(valueMin > tab[i]){
                valueMin = tab[i];
            }
        }
        return valueMin;
    }

    public boolean recherche(int n) {
        for(int valeur : tab){
            if( valeur == n)
                return true;
        }
        return false;
    }

    public void rangement(){
        int nbimpaires = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 != 0){
                nbimpaires++;
            }
        }
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 != 0 && i < nbimpaires){
                
            }      
        }
    }

    public double evalPolynome(double x) {
        double oui = 0;
        return oui;
    }
}