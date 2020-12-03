/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medecinsTraitants;

/**
 *
 * @author phantomr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // instanciation + initialisation directe des tableaux
         // (pour faciliter la lecture et la mise en place de ce test unitaire)
         Patient[] t1 = {new Patient("toto"), new Patient("titi"), new Patient("tata")};
         Patient[] t2 = {new Patient("titi"), new Patient("tutu"), new Patient("tete")};
         Patient[] t3 = {new Patient("tyty")};
         Patient[] t4 = {};
         Medecin m1 = new Medecin(101, t1);
         Medecin m2 = new Medecin(102, t2);
         Medecin m3 = new Medecin(110, t3);
         Medecin m4 = new Medecin(145, t4);
         Medecin[] tm = {m1, m2, m3, m4};
         MedecinsTraitants medecins = new MedecinsTraitants(tm);

         System.out.println("Nb patients = " + medecins.nombreDePatients());
         System.out.println("Nb moyen patients = " + medecins.nombreMoyenDePatients());

         int id = 102; // id du médecin à tester
         Medecin m = medecins.getMedecin(id);
         if (m != null) {
             System.out.println("Le medecin d'id #" + id + " existe bien ");
         } else {
             System.out.println("Pas de medecin #" + id);
         }

         id = 1000;
         m = medecins.getMedecin(id);
         if (m != null) {
             System.out.println("Le medecin d'id #" + id + " existe bien ");
         } 
         else {
             System.out.println("Pas de medecin #" + id);
         }

         String nomP = "toto"; // nom du patient à tester
         if (medecins.aUnHomonyme(nomP)) {
             System.out.println("Il existe au moins deux patients dont le nom est : " + nomP);
         }
        // l'utilisation de l'opérateur new ci-dessous permet de forcer la création d'une instance de String
        // différente de celle créée dans t2, mais qui représente également la même chaîne "titi"
        // → attention à utiliser le bon test pour les chaîne des caractères
         nomP = new String("titi");
         if (medecins.aUnHomonyme(nomP)) {
             System.out.println("Il existe au moins deux patients dont le nom est : " + nomP);
         }
         nomP = "tyty";
         if (medecins.aUnHomonyme(nomP)) {
             System.out.println("Il existe au moins deux patients dont le nom est : " + nomP);
         }
         nomP = "inconnu";
         if (medecins.aUnHomonyme(nomP)) {
             System.out.println("Il existe au moins deux patients dont le nom est : " + nomP);
         }


}
}