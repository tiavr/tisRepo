package exo1;

public abstract class Ecrivain {

    private String nom;

    public Ecrivain(String n){
        this.nom = n;
    }

    public String getNom(){
        return nom;
    }

    public abstract void ecrireOuvrage();


}
