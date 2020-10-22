/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;
import java.lang.*;
/**
 *
 * @author tiavr
 */
public class Trinome {
    private double a, b, c, d;
    
    public Trinome(double a, double b, double c){
        
        this.a = a;
        this.b = b;
        this.c = c;
        d = Math.pow(b, 2) - (4 * a * c);
    }
    
    public int nbRacines(){
        if (getD() > 0){
            return 2;
        }
        if(getD() == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public double getRacine1(){
        if(nbRacines() == 1){
            return -getB() / (2*getA());
        }
        if(nbRacines() == 2){
            return ((-getB() - Math.sqrt(getD())) / (2*getA()));
        }
        else {
            return 0;
        }
    }
    public double getRacine2(){
        if (nbRacines() == 1){
            return -getB() / (2*getA());
        }
        if(nbRacines() == 2){
            return ((-getB() + Math.sqrt(getD())) / (2*getA()));
        }
        else{
            return 0;
        }
    }
    
    public String equation(){
        return getA() + "x2" + getB() + "x" + getC() + " = 0";
    } 

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public double getD() {
        return d;
    }
    
}
