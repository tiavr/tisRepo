/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniFacebook;

/**
 *
 * @author tiavr
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne hugo = new Personne("Histe", "Hugo", new DateNaissance());
        hugo.setMeilleurAmi(hugo);
        hugo.ecritInfos();
    }
    
}
