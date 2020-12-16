/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

/**
 *
 * @author tiavr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medecin med1 = new Medecin("Bono", "Jean" , "ORL");
        Patient pat1 = new Patient("Track" , "Pat");
        Date date1 = new Date(6, 1, 2006);
        Acte acteCS = new Acte(Code.CS, 1);
        Acte acteORT = new Acte(Code.ORT, 50);
        Acte actePRO = new Acte(Code.PRO, 150);
        
        FicheDeSoins f1 = new FicheDeSoins(pat1, med1, date1);
        f1.ajouterActe(acteCS);
        f1.ajouterActe(acteORT);
        f1.ajouterActe(actePRO);
        
        Medecin med2 = new Medecin("Deblouze", "Agathe", "Cardiologue");
        Patient pat2 = new Patient("Bole", "Pat");
        Date date2 = new Date(23,10,2005);
        Acte acteCSC = new Acte(Code.CSC, 1);
        Acte acteKC = new Acte(Code.KC, 120);
        
        FicheDeSoins f2 = new FicheDeSoins(pat2, med2, date2);
        f2.ajouterActe(acteCSC);
        f2.ajouterActe(acteKC);
        
        Patient pat3 = new Patient("Bole", "Maggy");
        Date date3 = new Date(3,1,2006);
        Acte acteCSC2 = new Acte(Code.CSC, 2);
        
        FicheDeSoins f3 = new FicheDeSoins(pat3, med2, date3);
        f3.ajouterActe(acteCSC2);
        
        DossierMedical dossier = new DossierMedical();
        dossier.ajouterFiche(f1);
        dossier.ajouterFiche(f2);
        dossier.ajouterFiche(f3);
        
        dossier.afficher();
        Patient p1 = new Patient("Bole", "Pat");
        System.out.println("> cout du " + p1.toString() + " : " + dossier.coutPatient(p1));
        String spe = "Cardiologue";
        System.out.println("> cout de la specialite : " + spe + " : " + dossier.coutSpecialite(spe));
        Medecin m1 = new Medecin("Deblouze", "Agathe", "Cardiologue");
        dossier.afficherListePatients(m1);
        
        Date d1 = new Date(1, 11, 2005);
        Date d2 = new Date(5, 1, 2006);
        System.out.println("> nombre de fiches entre " + d1 + " et " + d2  + " : " + dossier.nombreFichesIntervalle(d1, d2));
    }
    
   
    
}
