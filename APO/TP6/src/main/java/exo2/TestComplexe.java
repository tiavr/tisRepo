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
public class TestComplexe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complexe c = new Complexe();
        c.setReal(-6.7);
        c.setImag(5);
        c.setArg(6);
        c.setMod(8);
        System.out.println(c.texte());
    }
    
}
