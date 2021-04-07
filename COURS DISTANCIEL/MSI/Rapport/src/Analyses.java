import java.util.ArrayList;
import java.util.List;

public class Analyses implements Affichable{
    
    private String titre;
    private java.util.ArrayList<Resultat> resultats;
    List<Affichable> list;

    public Analyses(String titre) {
        this.titre = titre;
        this.resultats = new java.util.ArrayList<>();

    }
    
    public void ajouterResultat(Resultat r) {

        this.resultats.add(r);
    }
    
    public void afficherEnTexte() {
        System.out.println(titre.toUpperCase());
        for(Resultat r:resultats) r.afficherEnTexte();
    }
    
    public void afficherEnHtml() {
        System.out.println("<HTML>");
        System.out.println("<HEAD>");
        System.out.println("<TITLE>"+titre+"</TITLE>");
        System.out.println("</HEAD>");
        System.out.println("<BODY>");
        System.out.println("<H1>"+titre+"</H1>");
        for(Resultat r:resultats) r.afficherHtml();
        System.out.println("</BODY>");
        System.out.println("</HTML>");;
    }

    @Override
    public String getNomType() {
        return "DOCUMENT";
    }

    @Override
    public String getValeur() {
        return titre;
    }

    @Override
    public List<Affichable> getContenuAffichable() {
        list = new ArrayList<Affichable>(resultats);
        return list;
    }
}