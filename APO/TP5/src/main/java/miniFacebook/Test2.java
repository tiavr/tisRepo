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
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateNaissance naissanceHermione = new DateNaissance(15, 0, 1990);
        Personne hermione = new Personne("Granger", "Hermione", naissanceHermione);

        DateNaissance naissanceRon = new DateNaissance(24, 8, 1988);
        Personne ron = new Personne("Weasley", "Ron", naissanceRon);
        
        DateNaissance naissanceHarry = new DateNaissance(23, 7, 1989);
        Personne harry = new Personne("Potter", "Harry", naissanceHarry);

        hermione.setAmi(ron);
        hermione.setMeilleurAmi(harry);
        
        ron.setAmi(harry);
        ron.setMeilleurAmi(hermione);
        
        harry.setAmi(ron);
        harry.setMeilleurAmi(hermione);
        
        hermione.ecritInfos();
        ron.ecritInfos();
        harry.ecritInfos();
    }
    
}
