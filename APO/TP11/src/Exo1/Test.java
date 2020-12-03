/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;
import java.util.*;
/**
 *
 * @author phantomr
 */
public class Test {

    // methode qui permet de "fabriquer" une instance de la classe Calendar
    // du package java.util dont la date est initialisée à année / mois / jour
    // et l'horaire à heure:min
    // (ce type de méthode s'appelle une méthode de type "factory")
    // Ici, elle permet de simplifier le code du main
    public static Calendar getNewCalendar(int annee, int mois, int jour, int heure, int min) {
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(annee,mois,jour,heure,min);
        return c;
    }

    // programme principal pour tester votre code
    public static void main(String[] args) {        
        Patient p = new Patient("Nicolas","Noel",7,107,"fatigue");

        Cardio c = new Cardio(getNewCalendar(2007,Calendar.DECEMBER,5,0,0), getNewCalendar(2007,Calendar.DECEMBER,7,23,59));

        c.ajouter(new Alert(getNewCalendar(2007, Calendar.DECEMBER, 5, 13, 16), Type.SEVERE, "CO2"));
        c.ajouter(new Alert(getNewCalendar(2007, Calendar.DECEMBER, 6, 11, 3), Type.BENINE, "EEG"));
        c.ajouter(new Alert(getNewCalendar(2007, Calendar.DECEMBER, 6, 17, 5), Type.SEVERE, "EEG"));
        c.ajouter(new Alert(getNewCalendar(2007, Calendar.DECEMBER, 5, 14, 45), Type.BENINE, "CO2"));
        c.ajouter(new Alert(getNewCalendar(2007, Calendar.DECEMBER, 7, 12, 05), Type.BENINE, "EEG"));
        c.ajouter(new Alert(getNewCalendar(2007, Calendar.DECEMBER, 5, 13, 16), Type.SEVERE, "ECG"));
        c.ajouter(new Alert(getNewCalendar(2007, Calendar.DECEMBER, 7, 12, 05), Type.SEVERE, "ECG"));
        Monitor m = new Monitor(p, c);
        m.ordonnerAlertes();
        System.out.println(m);
    }
}
