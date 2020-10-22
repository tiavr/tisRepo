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
public class UtilisationComplexe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double reel = InputDialog.getDouble("Donnez un reel");
        double imag = InputDialog.getDouble("Donnez une image");
        double arg = InputDialog.getDouble("Donnez un arg");
        double mod = InputDialog.getDouble("Donnez un module");
        Complexe c = new Complexe(reel, imag, arg, mod, true);
    }
    
}
