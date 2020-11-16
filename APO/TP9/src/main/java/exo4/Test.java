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
        
    System.out.println("Une première devinette");
    Devinette nombreMystère = new Devinette(4, 8);
    nombreMystère.cheat(7);
    System.out.println("Borne inférieure du domaine : " + nombreMystère.getMin());
    System.out.println("Borne supérieure du domaine : " + nombreMystère.getMax());
    System.out.println("Comparaison du nombre à trouver avec 6 : " + nombreMystère.essayer(6).getMessage());
    System.out.println("Comparaison du nombre à trouver avec 7 : " + nombreMystère.essayer(7).getMessage());
    System.out.println("Comparaison du nombre à trouver avec 8 : " + nombreMystère.essayer(8).getMessage());
    System.out.println("Une deuxième devinette (attention il y a un piège...)");
    nombreMystère.cheat(10);
    System.out.println("Comparaison du nombre à trouver avec 5 : " + nombreMystère.essayer(5).getMessage());
    System.out.println("Comparaison du nombre à trouver avec 6 : " + nombreMystère.essayer(6).getMessage());
    System.out.println("Comparaison du nombre à trouver avec 7 : " + nombreMystère.essayer(7).getMessage());
    System.out.println("Une troisième devinette (attention il y a des pièges...)");
    Devinette nombreMystère2 = new Devinette(7, -1);
    nombreMystère2.cheat(6);
    System.out.println("Borne inférieure du domaine : " + nombreMystère2.getMin());
    System.out.println("Borne supérieure du domaine : " + nombreMystère2.getMax());
    System.out.println("Comparaison du nombre à trouver avec -1 : " + nombreMystère2.essayer(-1).getMessage());
    System.out.println("Comparaison du nombre à trouver avec 10 : " + nombreMystère2.essayer(10).getMessage());
    System.out.println("Comparaison du nombre à trouver avec 6 : " + nombreMystère2.essayer(6).getMessage());
    System.out.println("Une devinette aléatoire");
    nombreMystère.auHasard();
    System.out.println("Borne inférieure du domaine : " + nombreMystère.getMin());
    System.out.println("Borne supérieure du domaine : " + nombreMystère.getMax());
    for (int i = nombreMystère.getMin(); i <= nombreMystère.getMax(); i++) {
        System.out.println("Test avec " + i + " : " + nombreMystère.essayer(i).getMessage());

    }
    System.out.println("Deviner un nombre connu");
    nombreMystère.cheat(7);
    nombreMystère.partieContreHumain();

    System.out.println("Deviner un nombre tiré au hasard");
    nombreMystère.auHasard();
    nombreMystère.partieContreHumain();
    }
}
