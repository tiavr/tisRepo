package ExpressionMaths;

import java.util.*;

public class Somme extends Expression {
    private Expression droite;

    private Expression gauche;
    // Constructeur initialisant les expressions
    public Somme(Expression e1, Expression e2) {
        gauche = e1;
        droite = e2;
    }

//Affichage de la somme
    public void afficher() {
        System.out.print("(");
        gauche.afficher();
        System.out.print("+");
        droite.afficher();
        System.out.print(")");
    }
    // Calcul de la somme des 2 expressions
    public int eval(){
        return gauche.eval() + droite.eval();
    }
    //Derivation en fonction de la variable en param en derivant les 2 expressions de la somme
    public Expression deriver(Variable var){
        return new Somme(gauche.deriver(var), droite.deriver(var));
    }

}
