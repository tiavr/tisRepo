/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

/**
 *
 * @author phantomr
 */
public class Liste {
    private Element tete;
    
    public Liste(){
        tete = null;
    }
    
    public void ajouterDebut(Element e){
        tete = e;
    }
    
    public void afficher(){
        int i = 0;
    }
}
