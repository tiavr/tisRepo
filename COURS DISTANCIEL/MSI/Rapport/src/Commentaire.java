import java.util.List;

public class Commentaire extends Rapport implements Affichable{
    private String titre;
    public Commentaire(String titre) {
        super(titre);
        this.titre = titre;
    }


    @Override
    public void afficherEnTexte() {

        System.out.println(titre);
    }

    public void afficherEnHtml() {

        System.out.println("<P>"+ titre +"</P>");
    }

    @Override
    public String getNomType() {
        return "TEXTE";
    }

    @Override
    public String getValeur() {
        return titre;
    }

    @Override
    public List<Affichable> getContenuAffichable() {
        return null;
    }
}
