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
public class FicheDeSoins {
    private Patient patient;
    private Medecin medecin;
    private Date date;
    private ArrayList<Acte> actes;

    public FicheDeSoins(Patient patient, Medecin medecin, Date date){
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        actes = new ArrayList<Acte>();
    }
    
    public void ajouterActe(Acte acte){
        actes.add(acte);
    }
    
    public void afficher(){
        System.out.println("------------------------");
        System.out.println("Fiche de soin du " + date.toString() + medecin.toString() + patient.toString());
        for(int i = 0; i < actes.size(); i++){
            System.out.println(actes.get(i).toString());
        }
        System.out.println("------------------------\n");

    }
    
    public double coutTotal(){
        double val = 0;
        for(int i = 0; i < actes.size(); i++){
            val+= actes.get(i).cout();
        }
        return val;
    }
    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @return the medecin
     */
    public Medecin getMedecin() {
        return medecin;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the actes
     */
    public ArrayList<Acte> getActes() {
        return actes;
    }
}
