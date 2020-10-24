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
public class Tableau {
    private  double[] t1; 
    
    public Tableau(double[] t) {
        t1 =t;
    }
    public void afficher(){
        for (double value : t1){
            System.out.println(value);
        }
    }
    
    public Tableau(int n){
        t1 = new double[n];
    }
    
    public void initialiser() {
    double [] t = {1.5, 1.0, -5.2, -34.3};
    t1 = t;
    }
    
    public double moyenne(){
        double sommeMoy = 0;
        for(double value : t1){
            sommeMoy += value;
        }
        double moy = sommeMoy / t1.length;
        return moy;
    }
    
    public double variance(){
        double sommeVar = 0;
        for(int i = 0; i < t1.length; i++){
            sommeVar += Math.pow((t1[i] - moyenne()), 2);
        }
        double var = sommeVar / t1.length;
        return var;
    }
    
    public double ecartType(){
        double ecartType = Math.sqrt(variance());
        return ecartType;
    }
    

}
