package posologie;


public class Medicament {

    private String nom;
    private Posologie[] pos;

    public Medicament(String nom, Posologie[] pos) {
        this.nom = nom;
        this.pos = pos;
    }

    public String getNom() {
        return nom;
    }

    // Question 1.2
    public int getNbContreIndications() {
        int nb = 0;
        for (int i = 0; i < pos.length; i++){
            if(pos[i].getQuantite() == -1){
                nb++;
            }
        }
        return nb;
    }

    // Question 1.3
    public Posologie getPosologie(String categorie) {
        Posologie p = null;
        int i = 0;
        while(i < pos.length && p == null){
            if(pos[i].getCategorie().equals(categorie)){
                p = pos[i];
            }
            else{
                i++;
            }
            
        }
        return p;
    }

    // Question 1.4
    public String toString() {
       String contre = "";
       String str = nom + " : \n";
       for(int i = 0; i < pos.length; i++){
           if(pos[i].getQuantite() == -1){
               contre = "- contre-indication : " + pos[i].getCategorie();
           }
           else{
               contre = "- " + pos[i].getCategorie() + " : " + pos[i].getQuantite() + " " + pos[i].getForme() + " " + pos[i].getFrequence() + " fois par jour";
           }
           str += contre + "\n";
       }
       return str;
       
    }

}
