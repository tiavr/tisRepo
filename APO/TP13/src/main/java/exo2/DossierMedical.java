/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;
import java.util.*;
/**
 *
 * @author tiavr
 */
public class DossierMedical {
    private ArrayList<FicheDeSoins> fiches;
    
    public DossierMedical(){
        fiches = new ArrayList<FicheDeSoins>();
    }
    
    public void ajouterFiche(FicheDeSoins fiche){
        fiches.add(fiche);
    }
    
    public void afficher(){
        System.out.println("Dossier medical informatise :");
        for(int i = 0; i < fiches.size(); i++){
            fiches.get(i).afficher();
        }
    }
    
    public double coutPatient(Patient p){
        double coutP = 0;
        
        for(int i = 0; i < fiches.size(); i++){
            if(fiches.get(i).getPatient().equals(p)){
                coutP += fiches.get(i).coutTotal();
            }
        }
        return coutP;
    }
    public double coutSpecialite(String specialite){
        double coutSpe = 0;
        for(int i =0; i < fiches.size(); i++){
            if(fiches.get(i).getMedecin().getSpecialite().equals(specialite)){
                coutSpe += fiches.get(i).coutTotal();
            }
        }
        return coutSpe;
    }
    
    public void afficherListePatients(Medecin m){
        ArrayList<Patient> listP;
        listP = new ArrayList<Patient>();
        for(int i = 0; i < fiches.size(); i++){
            if(fiches.get(i).getMedecin().equals(m)){
                if(!listP.contains(fiches.get(i).getPatient())){
                    listP.add(fiches.get(i).getPatient());
                }
            }
        }
        System.out.println(listP);
        
    }
    
    public int nombreFichesIntervalle(Date d1, Date d2){
        ArrayList<Date> dates = new ArrayList<Date>();
        
        for(int i = 0; i < fiches.size(); i++){
            if(fiches.get(i).getDate().compareTo(d2) == 0 || fiches.get(i).getDate().compareTo(d2) == -1 && fiches.get(i).getDate().compareTo(d1) == 0 || fiches.get(i).getDate().compareTo(d1) == 1 ){
                dates.add(fiches.get(i).getDate());
            }
        }
        return dates.size();
    }
    
    public void afficherDatesCroissantes(){
        Date min = fiches.get(0).getDate();
        ArrayList<Date> datesCroissant = new ArrayList<Date>();
        for(int i = 1; i < fiches.size(); i++){
            if(fiches.get(i).getDate().compareTo(min) == -1){
                min = fiches.get(i).getDate();
            }
        }
        datesCroissant.add(min);
        
    }
    /**
     * @return the soins
     */
    public ArrayList<FicheDeSoins> getSoins() {
        return fiches;
    }
}
