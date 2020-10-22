/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;
import java.lang.*;

/**
 *
 * @author tiavr
 */
public class Complexe {
    private double real, imag, mod, arg;
    
    
    public Complexe(){
        real = 0.0;
        imag = 0.0;
        arg = Math.atan(imag/real);
        mod = Math.sqrt((real * real) + (imag * imag));
    }
    
    public Complexe(double real, double imag, double mod, double arg, boolean cartesianCoord){
        if (cartesianCoord == true){
            this.real = real;
            this.imag = imag;   
            this.arg = Math.atan(imag/real);
            this.mod = Math.sqrt((real * real) + (imag * imag));
        }
        else{
            setMod(mod);
            setArg(arg);
            
        }
    }
    

    public double getReal() {
        return real;
    }

    /**
     * @param real the real to set
     */
    public void setReal(double real) {
        this.real = real;
        cartesienneVersPolaire();
    }

    /**
     * @return the imag
     */
    public double getImag() {
        return imag;
    }

    /**
     * @param imag the imag to set
     */
    public void setImag(double imag) {
        this.imag = imag;
        cartesienneVersPolaire();
    }
    
    public String texte(){
        return real + " + " + imag + "i" + " " + ":" + " " + mod + ".e" + "^i." + arg;
    }
    
    private void cartesienneVersPolaire(){
        arg = Math.atan(getImag() / getReal() );
        mod = Math.sqrt((getReal() * getReal()) + (getImag() * getImag()));
    }
    
    public void setMod(double mod){
        this.mod = mod;
        real = mod * Math.cos(arg);
        imag = mod * Math.sin(arg); 
    }
    
    public void setArg(double arg){
        this.arg = arg;
        real = mod * Math.cos(arg);
        imag = mod * Math.sin(arg); 
    }

}
