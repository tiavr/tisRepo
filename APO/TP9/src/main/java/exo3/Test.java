/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;
import java.util.*;
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
        String noms[] = {"RICOT Léa",
            "HONXA Cécile",
            "ORAQ Anne",
            "KUZBIDON Alex",
            "MUDA Albert"};
        int naissances[] = {1924, 1954, 1943, 1915, 1987};
        ServiceCHU s = new ServiceCHU(noms, naissances);

        String p = "HONXA Cécile";
        if (s.estPatient(p)) {
            System.out.println(p + " est un(e) patient(e) du service.");
            System.out.println(s.getAnnee(p));
        } else {
            System.out.println(p + " n'est pas un(e) patient(e) du service.");
            System.out.println(s.getAnnee(p));
        }

        p = "OINTOUSSA Cécile";
        if (s.estPatient(p)) {
            System.out.println(p + " est un(e) patient(e) du service.");
            System.out.println(s.getAnnee(p));
        } else {
            System.out.println(p + " n'est pas un(e) patient(e) du service.");
            System.out.println(s.getAnnee(p));
        }

        p = "MUDA Albert";
        if (s.estPatient(p)) {
            System.out.println(p + " est un(e) patient(e) du service.");
            System.out.println(s.getAnnee(p));
        } else {
            System.out.println(p + " n'est pas un(e) patient(e) du service.");
            System.out.println(s.getAnnee(p));
        }

        System.out.println(Arrays.toString(s.getGeneration(1930, 1990)));

    }

}
