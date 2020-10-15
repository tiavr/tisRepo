/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniFacebook;

/**
 *
 * @author tiavr
 */
public class Personne {
    private String nom, prenom;
    private DateNaissance dateDeNaissance;
    private Personne ami, meilleurAmi;
    
    public Personne(String nom, String prenom, DateNaissance naissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = naissance;
    }
    
    public void setAmi(Personne unAmi){
        this.ami = unAmi;
    }
    
    public void setMeilleurAmi(Personne unAmi){
        this.meilleurAmi = unAmi;
    }
    
    public Personne getAmi(){
        return ami;
    }
    public Personne getMeilleurAmi(){
        return meilleurAmi;
    }
    
    public void ecritInfos(){
        System.out.println("-------------------------------");
        System.out.println(prenom + " " + nom);
        System.out.print("Né(e) le : ");
        dateDeNaissance.ecritDate();
        System.out.println("(" + dateDeNaissance.age() + " ans)");
        System.out.println("Meilleur ami : " + ami.prenom + " " + ami.nom);
        System.out.println("Ami : " + meilleurAmi.prenom + " " + meilleurAmi.nom);
        System.out.println("-------------------------------");
    }
    
}
