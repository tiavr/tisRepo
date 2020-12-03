package medecinsTraitants;

import medecinsTraitants.*;

public class MedecinsTraitants {

    private Medecin[] medecins;

    public MedecinsTraitants(Medecin[] medecins) {
        this.medecins = medecins;
    }

    // Question 4.1
    public int nombreDePatients() {
        int nb = 0;
        for(int i = 0; i < medecins.length; i++){
            nb+= medecins[i].getNombrePatients();
        }
        return nb;
    }

    // Question 4.2
    public double nombreMoyenDePatients() {
        // A compléter
    }

    // Question 4.3
    public Medecin getMedecin(int id) {
        // A compléter
    }

    // Question 4.4
    public boolean aUnHomonyme(String nomPatient) {
        // A completer
    }
}
