import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Rapport implements Affichable{

    private String titre;
    private ArrayList<Rapport> elem;
    List<Affichable> list;


    public Rapport(String titre){
        this.titre = titre;
        elem = new ArrayList<>();

    }

    public void ajouterElement(Rapport o){
        elem.add(o);
    }

    public void afficherEnTexte(){
        System.out.println(titre.toUpperCase());
        for(Rapport e: elem) e.afficherEnTexte();
    }

    public void afficherEnHtml() {
        System.out.println("<HTML>");
        System.out.println("<HEAD>");
        System.out.println("<TITLE>"+titre+"</TITLE>");
        System.out.println("</HEAD>");
        System.out.println("<BODY>");
        System.out.println("<H1>"+titre+"</H1>");
        for(Rapport e: elem) e.afficherEnHtml();
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
        list = new ArrayList<Affichable>(elem);
        return list;
    }
}
