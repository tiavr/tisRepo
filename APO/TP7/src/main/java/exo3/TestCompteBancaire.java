/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;

/**
 *
 * @author tiavr
 */
public class TestCompteBancaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  CompteBancaire inconnu = new CompteBancaire();
  CompteBancaire ken = new CompteBancaire(2329, "Ken Bowie");
  CompteBancaire alain = new CompteBancaire(2330, "Alain Die", 500);
 
  System.out.println("Infos au d�part....\n");
  System.out.print(inconnu.infos());
  System.out.print(ken.infos());
  System.out.print(alain.infos());
 
 
  double somme = 140.0;
  boolean succes;
 
  System.out.println("\nRetrait de " + somme +" euros...\n");
  succes = inconnu.retrait(somme);
  System.out.print(inconnu.infos());
  if (! succes) {
    System.out.println(inconnu.getClient() + " n'a pas pu retirer la somme de " + somme + "euros.\n");
  }
 
  succes = ken.retrait(somme);
  System.out.print(ken.infos());
  if (! succes) {
    System.out.println(ken.getClient() + " n'a pas pu retirer la somme de " + somme + "euros.\n");
  }
 
  succes = alain.retrait(somme);
  System.out.print(alain.infos());
  if (! succes) {
    System.out.println(alain.getClient() + " n'a pas pu retirer la somme de " + somme + "euros.\n");
  }
 
 
  somme = 100.0;
  System.out.println("\nD�p�t de " + somme +" euros...\n");
  inconnu.depot(somme);
  System.out.print(inconnu.infos());
  ken.depot(somme);
  System.out.print(ken.infos());
  alain.depot(somme);
  System.out.print(alain.infos());
}
    
}
