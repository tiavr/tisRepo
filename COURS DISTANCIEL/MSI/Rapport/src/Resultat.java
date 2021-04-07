import java.util.List;

public class Resultat implements Affichable{
    
    private String libelle;
    private double valeur;

    public Resultat(String libelle, double valeur) {
        this.libelle = libelle;
        this.valeur = valeur;
    }
    
    public void afficherEnTexte() {

        System.out.println(libelle+" = "+ valeur);
    }
    
    public void afficherHtml() {

        System.out.println("<P>"+libelle+" = "+ valeur+"</P>");
    }

    @Override
    public String getNomType() {
        return "TEXTE";
    }

    @Override
    public String getValeur() {
        return libelle + " = " + valeur;
    }

    @Override
    public List<Affichable> getContenuAffichable() {
        return null;
    }
}