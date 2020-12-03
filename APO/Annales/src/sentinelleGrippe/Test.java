/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentinelleGrippe;

/**
 *
 * @author phantomr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Incidence[] donnees = new Incidence[3];
        donnees[0] = new Incidence(201751,45);    // sur la semaine 51 de 2017, le taux de cas de varicelle était de 45 pour 100.000 personnes
        donnees[1] = new Incidence(201752,67);    // sur la semaine 52 de 2017, le taux de cas de varicelle était de 67 pour 100.000 personnes
        donnees[2] = new Incidence(201751,45);    // introduction volontaire d'un doublon (à la semaine 51 de 2017) pour tester la méthode sansDoublon()
        Surveillance varicelle = new Surveillance("varicelle",donnees);

        System.out.println("Surveillance de la varicelle");
        System.out.println(" - pic de l'épidémie : " + varicelle.picEpidemie());
        System.out.println(" - incidence de la semaine 52 de l'année 2017 : " + varicelle.getIncidence(201752));
        System.out.println(" - incidence de la semaine 03 de l'année 2018 : " + varicelle.getIncidence(201803));
        System.out.println(" - sans doublon : " + varicelle.sansDoublon());

        donnees = new Incidence[3];
        donnees[0] = new Incidence(201751, 174);
        donnees[1] = new Incidence(201752, 257);
        donnees[2] = new Incidence(201801, 312);
        Surveillance grippe = new Surveillance("grippe",donnees);

        System.out.println("Surveillance de la grippe");
        System.out.println(" - pic de l'épidémie : " + grippe.picEpidemie());
        System.out.println(" - incidence de la semaine 52 de l'année 2017 : " + grippe.getIncidence(201752));
        System.out.println(" - incidence de la semaine 47 de l'année 2017 : " + grippe.getIncidence(201747));
        System.out.println(" - sans doublon : " + grippe.sansDoublon());

    }
    
}
