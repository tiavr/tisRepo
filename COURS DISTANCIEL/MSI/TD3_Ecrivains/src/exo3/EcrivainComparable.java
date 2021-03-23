package exo3;

public class EcrivainComparable implements Comparable{
    private int nbOuvrages;
    private String nom;

    public EcrivainComparable(String n){
        this.nom = n;
        nbOuvrages = 0;
    }

    public String getNom(){
        return nom;
    }

    public void ecrireOuvrage(){
        System.out.println("Ceci est un ouvrage écrit par " + nom);
        nbOuvrages++;
    }

    @Override
    public int compareTo(EcrivainComparable o) {
        if(nbOuvrages < o.nbOuvrages){
            return -1;
        }
        else if(nbOuvrages > o.nbOuvrages){
            return 1;
        }
        else{
            return 0;
        }
    }
}
