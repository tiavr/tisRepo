import javax.sound.sampled.Port;
import java.sql.SQLOutput;

public class Mine {
    private int taille;
    private Portemine portemine;

    public Mine(){
        taille = 2;
    }

    public void ecrireAuGraphite(String texte){
        if(taille > 0 ){
            System.out.println(texte);
            taille--;
        }
        else{
            System.out.println("La mine est usée.");
            portemine.mineSuivante();
        }
    }

    public int getTaille() {
        return taille;
    }

    public void setPortemine(Portemine pm){
        this.portemine = pm;
    }

    public Portemine getPortemine(){
        return portemine;
    }
}
