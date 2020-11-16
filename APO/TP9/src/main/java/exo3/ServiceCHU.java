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
public class ServiceCHU {
    private final String[] patients;
    private final int[] annees;
    
    public ServiceCHU(String[] patients, int[] annees){
        this.patients = patients;
        this.annees = annees;
    }
    
    public boolean estPatient(String nom){
        boolean contains = Arrays.stream(patients).anyMatch(nom::equals);
        return contains;
    }
    
    public int getAnnee(String nom){
        if(estPatient(nom)){
            int index = Arrays.asList(patients).indexOf(nom);
            return annees[index];
        }
        return -1;
    }
    
    public String[] getGeneration(int a1, int a2){
        String res = "";
        for(int i = 0; i < annees.length; i++){
            if(annees[i] >= a1 && annees[i] <= a2){
                res += patients[i] + ";";
            }
        }
        String[] val = res.split(";");
        return val;
    }
    

}
