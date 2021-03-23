package ExpressionMaths;


public class ExpNeg extends Expression {
    //Attributs
    private Expression exp;
    //Init de l'exp
    public ExpNeg(Expression exp){
        this.exp = exp;
    }
    //Affichage de l'exp neg
    public void afficher(){

        System.out.print(exp);
    }

    //Calcul de la valeur int en négatif
    public int eval() {
        return -exp.eval();
    }
    //Derivation en fonction de la variable au négatif
    public Expression deriver(Variable var){
        return new ExpNeg(var);
    }

}
