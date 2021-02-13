import java.util.ArrayList;
import java.util.List;

public class StyloPlume {
    private final Bouchon b;
    private Cartouche c;

    public StyloPlume(String marque){
        b = new Bouchon(marque);
        this.c = null;

    }

    public void ecrire(String texte){
        if (c == null || c.estVide()){
            System.out.println("Il n'y a pas de cartouche ou la cartouche est vide");
        }
        else{
            System.out.println(b.getMarque() + " - " + c.getCouleur() + " : " + texte);
        }
    }

    public boolean insererCartouche(Cartouche c){
        if(this.c == null && !c.getEstUtilise()){
            this.c = c;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean retirerCartouche(){
        if(c == null){
            return false;
        }else{
            c = null;
            return true;
        }
    }
}
