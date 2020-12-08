/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo1;

/**
 *
 * @author tiavr
 */
public class Chien extends Mammifere {
    public Chien(String nom){
        super(nom);
    }
    
    public String cri(){
        return "Wouaf !";   
    }

    @Override
    public String toString() {
        return super.toString() + " et je peux faire : " + cri() + ", son cri est : " + cri();

    }
    
    
}
