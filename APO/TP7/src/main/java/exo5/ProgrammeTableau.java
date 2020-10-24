/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo5;
import java.lang.*;
/**
 *
 * @author tiavr
 */
public class ProgrammeTableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double moy, moy2, moy3;
        double sommeVar = 0, sommeVar2 = 0, sommeVar3 = 0;
        double var, var2, var3;
        double sommeMoy = 0, sommeMoy2 = 0, sommeMoy3 = 0;
        double somme = 0;
        double sommeCarre = 0;
        double [] t1 = {1.5, 1.0, -5.2, -34.3};
        double [] t2 = {-4.2, 1.7, 5.8};
        double [] t3 = {6.7, -8.4, -12.6, 4.2, 0.0, 2.7, -8.5};
        double valueMin = t1[0];
        double valueMax = valueMin;
        for (double value : t1){
            System.out.println(value);
        }
        
        for(int i = 0; i < t1.length; i++){
            System.out.println(t1[i]);
    }
        for(int i = t1.length - 1; i >= 0; i--){
            System.out.println(t1[i]);
    }
        for (double value : t1){
            somme += value;
        }
        System.out.println(somme);
        
        for(double value : t1){
            sommeCarre += (value * value);
        }
        System.out.println(sommeCarre);
        
        for(int i =0; i < t1.length; i++){
            if(valueMin > t1[i]){
                valueMin = t1[i];
            }
        }
        System.out.println(valueMin);
        
        for(int i =0; i < t1.length; i++){
            if(valueMax < t1[i]){
                valueMax = t1[i];
            }
        }
        System.out.println(valueMax);
        
        for(double value : t1){
            sommeMoy += value;
        }
        moy = sommeMoy / t1.length;
        System.out.println(moy);
        
        for(int i = 0; i < t1.length; i++){
            sommeVar += Math.pow((t1[i] - moy), 2);
        }
        var = sommeVar / t1.length;
        System.out.println(var);
        
        double ecartType = Math.sqrt(var);
        System.out.println(ecartType);
        
        for(double value : t2){
            sommeMoy2 += value;
        }
        moy2 = sommeMoy2 / t2.length;
        System.out.println(moy2);
        
        for(int i = 0; i < t2.length; i++){
            sommeVar2 += Math.pow((t2[i] - moy2), 2);
        }
        var2 = sommeVar2 / t2.length;
        System.out.println(var2);
        
        double ecartType2 = Math.sqrt(var2);
        System.out.println(ecartType2);
        
        for(double value : t3){
            sommeMoy3 += value;
        }
        moy3 = sommeMoy3 / t3.length;
        System.out.println(moy3);
        
        for(int i = 0; i < t3.length; i++){
            sommeVar3 += Math.pow((t3[i] - moy3), 2);
        }
        var3 = sommeVar3 / t3.length;
        System.out.println(var3);
        
        double ecartType3 = Math.sqrt(var3);
        System.out.println(ecartType3);
        
        
    
        
    
    }
}
