package sentinelleGrippe;


public class Surveillance {

    private String nom;
    private Incidence[] donnees;

    public Surveillance(String nom, Incidence[] donnees) {
        this.nom = nom;
        this.donnees = donnees;
    }

    // Question 2.2
    private int getDateIndice(int indice) {
        if(indice > donnees.length -1){
            return -1;
        }
        return donnees[indice].getDate();
    }

    // Question 2.3
    public int picEpidemie() {
        int date = 0;
        for(int i = 1; i < donnees.length; i++){
            if(donnees[i].getValeur() < donnees[i-1].getValeur()){
                date = donnees[i-1].getDate();
            }
        }
        return date;
    }

    // Question 2.4
    public int getIncidence(int date) {
        int valeur = -1;
        int i = 0;
        while(i < donnees.length && valeur == -1){
            if(donnees[i].getDate() == date){
                valeur = donnees[i].getValeur();
            }
            else{
                i++;
            }
        }
        return valeur;
    }

    // Question 2.5
    public boolean sansDoublon() {
        boolean sansDoublon = true;
        int i = 0;
        int j = 0;
        while(i < donnees.length - 1 && sansDoublon){
            j=i+1;
            while(j < donnees.length && sansDoublon){
                if(getDateIndice(j) == getDateIndice(i)){
                    sansDoublon = false;
                }
                j++;
            }
            i++;
        }
        return sansDoublon;
        
    }
}
