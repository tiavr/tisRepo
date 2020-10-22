/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo6;

/**
 *
 * @author tiavr
 */
public class EntierPositif {
    private int val;

    /**
     * @return the val
     */
    public int getVal() {
        return val;
    }

    /**
     * @param val the val to set
     */
    public void setVal(int val) {
        if(val >0){
            this.val = val;
        }
    }
    
    /*public void afficher(){
        System.out.println(val);
    }
    */
    
    public String toString(){
        return "Entier positif : " + val;
    }
    
}
