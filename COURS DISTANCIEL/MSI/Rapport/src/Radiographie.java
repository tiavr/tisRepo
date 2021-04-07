import java.util.List;

public class Radiographie extends Rapport implements Affichable{

    private String url;

    public Radiographie(String titre){
        super(titre);
        this.url = titre;
    }

    @Override
    public void afficherEnTexte() {
        System.out.println("Image URL = " + url);
    }

    public void afficherEnHtml() {

        System.out.println("<P>"+ "Image URL = " + url +"</P>");
    }
    @Override
    public String getNomType() {
        return "IMAGE";
    }

    @Override
    public String getValeur() {
        return url;
    }

    @Override
    public List<Affichable> getContenuAffichable() {
        return null;
    }
}
