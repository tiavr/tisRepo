/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo4;

/**
 *
 * @author tiavr
 */
public enum Comparaison {
    TROP_PETIT("Le nombre est trop petit"),
    EGAL("Bravo, c'est la bonne réponse !"),
    TROP_GRAND("Le nombre est trop grand");
    
    private String message;
    
    private Comparaison(String message){
        this.message = message;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    
    
}
