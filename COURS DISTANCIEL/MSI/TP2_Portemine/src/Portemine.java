import javax.sound.sampled.Port;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Portemine {

    private ArrayList<Mine> mines;
    private static final int maxMines = 3;

    public Portemine(Mine m){
        mines = new ArrayList<Mine>(maxMines);
        mines.add(m);
        m.setPortemine(this);
    }

    public boolean ajouterMine(Mine m){
        if(mines.size() < maxMines && !mines.contains(m)){
            mines.add(m);
            m.setPortemine(this);
            System.out.println("Une mine a été ajoutée : le portemine contient " + mines.size() + " mines.");
            return true;
        }
        else{
            System.out.println("Le portemine est plein");
            return false;
        }
    }

    public void ecrire(String texte){
        mines.get(0).ecrireAuGraphite(texte);
    }

    public boolean mineSuivante(){
        if(mines.get(0).getPortemine() == this && mines.size() > 1){
            Mine m = mines.remove(0);
            m.setPortemine(null);
            System.out.println("Une mine a été enlevée : il reste " +mines.size() + " mines." );
            return true;
        }
        else{
            System.out.println("Il ne reste deja qu'une seule mine dans le portemine.");
            return false;
        }
    }
}
