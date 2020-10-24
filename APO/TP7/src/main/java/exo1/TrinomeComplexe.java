/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo1;
import java.lang.*;
/**
 *
 * @author tiavr
 */
public class TrinomeComplexe {

    private double a, b, c, d;
    
    public TrinomeComplexe(double a, double b, double c){
        
        this.a = a;
        this.b = b;
        this.c = c;
        d = Math.pow(b, 2) - (4 * a * c);
    }
    
    public int nbRacines(){
        if (d > 0){
            return 2;
        }
        if(d == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public Complexe getRacine1(){
        Complexe c = new Complexe();
        if(nbRacines() == 1){
            c.setReal(-b / (2*a));
        }
        if(nbRacines() == 2){
            c.setReal((-b - Math.sqrt(d)) / (2*a));
        }
        else {
            c.setReal(-b / (2*a));
            c.setImag(Math.sqrt(-d) / 2*a);
        }
        return c;
    }
    public Complexe getRacine2(){
        Complexe c = new Complexe();
        if(nbRacines() == 1){
            c.setReal(-b / (2*a));
        }
        if(nbRacines() == 2){
            c.setReal((-b + Math.sqrt(d)) / (2*a));
        }
        else {
            c.setReal(-b / (2*a));
            c.setImag(Math.sqrt(d) / 2*a);
        }
        return c;
    }
    
    public String equation(){
        return a + "x2" + b + "x" + c + " = 0";
    } 

    /**
     * @return the a
     */
    


}
