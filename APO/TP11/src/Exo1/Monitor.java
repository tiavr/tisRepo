/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;

/**
 *
 * @author phantomr
 */
public class Monitor {
    private Patient patient;
    private Cardio cardio;

    public Monitor(Patient patient, Cardio cardio) {
        this.patient = patient;
        this.cardio = cardio;
    }
    
    public void ordonnerAlertes(){
        cardio.triSelection();
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @return the cardio
     */
    public Cardio getCardio() {
        return cardio;
    }

    @Override
    public String toString() {
        return "-patient : \n" + patient + "-cardio : \n" + cardio;
    }
    
    
}
