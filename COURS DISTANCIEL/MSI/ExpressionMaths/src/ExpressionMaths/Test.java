package ExpressionMaths;

public class Test {
    public static void main(String[] args) {
        //Instanciation des constantes, variables, sommes et produit
        Constante c = new Constante(1);
        Variable v = new Variable("x");
        Somme s = new Somme(c, v);
        Produit p = new Produit(c, v);
        //Affichage somme
        s.afficher();
        System.out.println();

        //Instanciation des expressions dérivées
        Expression d = s.deriver(new Variable("x"));

        Expression a = p.deriver(new Variable("x"));
        //Affichage des expressions dérivées
        d.afficher();
        System.out.println();
        a.afficher();
    }
}
