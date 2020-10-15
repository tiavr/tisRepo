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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateNaissance naissancePaul = new DateNaissance(5,3,2005);
        Personne paul = new Personne("USSION", "Paul", naissancePaul);

        paul.ecritInfos();

        DateNaissance naissanceAndree = new DateNaissance(17,11,2005);
        Personne andree =  new Personne("SAN FRAPET", "Andrée", naissanceAndree);

        System.out.println("Andrée est la meilleure amie de Paul : " + paul.meilleurAmis(andree)); // false
        paul.setMeilleurAmi(andree);
        paul.ecritInfos();
        andree.ecritInfos();
        System.out.println("Andrée est la meilleure amie de Paul : " + paul.meilleurAmis(andree)); // true
        System.out.println("Paul est le meilleur ami d'Andrée : " + andree.meilleurAmis(paul)); // false 
        System.out.println("");
        System.out.println("----------- Binomes -----------");
        System.out.println("");

        Binome b1 = new Binome(paul, andree);
        System.out.println("Binome b1 entre amis : " + b1.meilleurAmis()); // false
        andree.setMeilleurAmi(paul);
        System.out.println("Binome b1 entre amis : " + b1.meilleurAmis()); // true                

        DateNaissance naissanceOndine = new DateNaissance(7, 10, 2005);
        Personne ondine = new Personne("HOUCESSOAR", "Ondine", naissanceOndine);

        DateNaissance naissanceAlain = new DateNaissance(2, 12, 2005);
        Personne alainP = new Personne("PROVIST", "Alain", naissanceAlain);        

        DateNaissance naissanceJumeau = new DateNaissance(26, 7, 2005);
        Personne alex = new Personne("THÉRIEUR", "Alex", naissanceJumeau);
        Personne alainT = new Personne("THÉRIEUR", "Alain", naissanceJumeau);

        Binome b2 = new Binome(ondine,alainP);
        System.out.println("Binome b2 entre amis : " + b2.meilleurAmis()); // false
        Binome b3 = new Binome(alex,alainT);
        System.out.println("Binome b3 entre amis : " + b3.meilleurAmis()); // false
        alainP.setMeilleurAmi(alainT);
        System.out.println("Affinité entre b2 et b3 : " + b2.meilleurAmis(b3)); // true
        System.out.println("Affinité entre b3 et b2 : " + b3.meilleurAmis(b2)); // false
        alainP.setMeilleurAmi(alex);
        System.out.println("Affinité entre b2 et b3 : " + b2.meilleurAmis(b3)); // true
        alainP.setMeilleurAmi(null);
        System.out.println("Affinité entre b2 et b3 : " + b2.meilleurAmis(b3)); // false
        alex.setMeilleurAmi(ondine);
        System.out.println("Affinité entre b3 et b2 : " + b3.meilleurAmis(b2)); // true
        alex.setMeilleurAmi(alainP);
        System.out.println("Affinité entre b3 et b2 : " + b3.meilleurAmis(b2)); // true
    }
    
}
