/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo1;
// Import needed.
import java.lang.*;
/**
 *  *  This class allows you to create a Complexe object and to display the equation, the argument and the modulus.
 * Exemple of use : <br>
 * <pre>
 *     Complexe c;
 *     
 *
 *     // Create an complex object.
 *     c = new Complexe(1, 1, 1, 1, true or false);
 *
 * </pre>
 *
 * 
 * 
 *
 *
 *
 * @author tiavr
 * @version 1.1
 */
public class Complexe {
    private double real, imag, mod, arg;
    
    
    public Complexe(){
        real = 0.0;
        imag = 0.0;
        arg = Math.atan(imag/real);
        mod = Math.sqrt((real * real) + (imag * imag));
    }
    
    /**
     * Initialize Complexe object
     * @param real set real
     * @param imag set imag
     * @param mod set mod
     * @param arg set arg
     * @param cartesianCoord true or false
     */
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
    
    /**
    * @return the real
    */
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
    
    /**
     * Display l'equation
     * @return la chaine d'équation
     */
    public String texte(){
        return real + " + " + imag + "i" + " " + ":" + " " + mod + ".e" + "^i." + arg;
    }
    
    /**
     * Change les arg et les mod
     */
    private void cartesienneVersPolaire(){
        arg = Math.atan(getImag() / getReal() );
        mod = Math.sqrt((getReal() * getReal()) + (getImag() * getImag()));
    }
    
    /**
     * Set mod and change real and imag
     * @param mod set the mod
     */
    public void setMod(double mod){
        this.mod = mod;
        real = mod * Math.cos(arg);
        imag = mod * Math.sin(arg); 
    }
    
    /**
     * Set arg and change real and imag
     * @param arg set arg
     */
    public void setArg(double arg){
        this.arg = arg;
        real = mod * Math.cos(arg);
        imag = mod * Math.sin(arg); 
    }

}
