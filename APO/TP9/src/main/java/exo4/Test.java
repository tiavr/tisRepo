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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("Une premi�re devinette");
    Devinette nombreMyst�re = new Devinette(4, 8);
    nombreMyst�re.cheat(7);
    System.out.println("Borne inf�rieure du domaine : " + nombreMyst�re.getMin());
    System.out.println("Borne sup�rieure du domaine : " + nombreMyst�re.getMax());
    System.out.println("Comparaison du nombre � trouver avec 6 : " + nombreMyst�re.essayer(6).getMessage());
    System.out.println("Comparaison du nombre � trouver avec 7 : " + nombreMyst�re.essayer(7).getMessage());
    System.out.println("Comparaison du nombre � trouver avec 8 : " + nombreMyst�re.essayer(8).getMessage());
    System.out.println("Une deuxi�me devinette (attention il y a un pi�ge...)");
    nombreMyst�re.cheat(10);
    System.out.println("Comparaison du nombre � trouver avec 5 : " + nombreMyst�re.essayer(5).getMessage());
    System.out.println("Comparaison du nombre � trouver avec 6 : " + nombreMyst�re.essayer(6).getMessage());
    System.out.println("Comparaison du nombre � trouver avec 7 : " + nombreMyst�re.essayer(7).getMessage());
    System.out.println("Une troisi�me devinette (attention il y a des pi�ges...)");
    Devinette nombreMyst�re2 = new Devinette(7, -1);
    nombreMyst�re2.cheat(6);
    System.out.println("Borne inf�rieure du domaine : " + nombreMyst�re2.getMin());
    System.out.println("Borne sup�rieure du domaine : " + nombreMyst�re2.getMax());
    System.out.println("Comparaison du nombre � trouver avec -1 : " + nombreMyst�re2.essayer(-1).getMessage());
    System.out.println("Comparaison du nombre � trouver avec 10 : " + nombreMyst�re2.essayer(10).getMessage());
    System.out.println("Comparaison du nombre � trouver avec 6 : " + nombreMyst�re2.essayer(6).getMessage());
    System.out.println("Une devinette al�atoire");
    nombreMyst�re.auHasard();
    System.out.println("Borne inf�rieure du domaine : " + nombreMyst�re.getMin());
    System.out.println("Borne sup�rieure du domaine : " + nombreMyst�re.getMax());
    for (int i = nombreMyst�re.getMin(); i <= nombreMyst�re.getMax(); i++) {
        System.out.println("Test avec " + i + " : " + nombreMyst�re.essayer(i).getMessage());

    }
    System.out.println("Deviner un nombre connu");
    nombreMyst�re.cheat(7);
    nombreMyst�re.partieContreHumain();

    System.out.println("Deviner un nombre tir� au hasard");
    nombreMyst�re.auHasard();
    nombreMyst�re.partieContreHumain();
    }
}
