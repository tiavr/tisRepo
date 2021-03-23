package ExpressionMaths;


public class Produit extends Expression {
    //Attributs expression
    private Expression gauche;
    private Expression droite;

    //Initialisation des exp
    public Produit(Expression e1, Expression e2) {
        gauche = e1;
        droite = e2;
    }
    //Affichage du produit
    public void afficher() {
        System.out.print("(");
        gauche.afficher();
        System.out.print("*");
        droite.afficher();
        System.out.print(")");
    }

    //Calcul du produit sous forme d'un int
    public int eval(){

        return gauche.eval() * droite.eval();
    }
    // Derivation en fonction de la variable en param
    public Expression deriver(Variable var){
        Expression p1 = new Produit(gauche.deriver(var), droite);
        Expression p2 = new Produit(gauche, droite.deriver(var));
        return new Somme(p1, p2);
    }
}
