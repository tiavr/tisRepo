package medecinsTraitants;

import medecinsTraitants.*;

public class Medecin {
    private int id;
    private Patient[] patients;

    public Medecin(int id, Patient[] patients) {
        this.id = id;
        this.patients = patients;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient(int i) {
        if (i >=0 && i < patients.length)
            return patients[i];
        else
            return null;
    }
    
    public int getNombrePatients(){
        return patients.length;
    }
    
}
