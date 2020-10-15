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
public class Binome {
    private Personne p1;
    private Personne p2;
    
    public Binome(Personne p1, Personne p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public boolean meilleurAmis(){
        if(p1.meilleurAmis(p2) == true && p2.meilleurAmis(p1) == true){
            return true;
        }
        return false;
    }
    public boolean meilleurAmis(Binome b){
        if (this.p1.meilleurAmis(b.p1) == true || this.p1.meilleurAmis(b.p2) == true || this.p2.meilleurAmis(b.p1) == true || this.p2.meilleurAmis(b.p2) == true){
            return true;
        } 
        return false;
    }
}
