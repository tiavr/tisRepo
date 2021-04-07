
public class Test {

    public static void main(String[] args) {
        
        // Question 1
        System.out.println();
        System.out.println("## Question 1 :");
        System.out.println();
        Analyses a = new Analyses("Titre des analyses");
        Resultat r1 = new Resultat("Un exemple de résultat", 12.345);
        Resultat r2 = new Resultat("Un autre exemple de résultat", 67.890);
        a.ajouterResultat(r1);
        a.ajouterResultat(r2);
        a.afficherEnTexte();

        // Question 1 bis
        System.out.println();
        System.out.println("## Question 1 bis :");
        System.out.println();
        Rapport r = new Rapport("Titre de rapport");
        Commentaire c = new Commentaire("Un exemple de commentaire.");
        Radiographie rg = new Radiographie("http://url.de.la.radiographie");
        r.ajouterElement(c);
        r.ajouterElement(rg);
        r.afficherEnTexte();

        System.out.println("Test positif");

        // Question 2
        System.out.println();
        System.out.println("## Question 2 :");
        System.out.println();
        Afficheur aff = new Afficheur();
        aff.afficherAffichableEnTexte(a);
        aff.afficherAffichableEnTexte(r);
        System.out.println();
        aff.afficherAffichableEnHtml(a);
        aff.afficherAffichableEnHtml(r);
        System.out.println("Test positif");
    }
}