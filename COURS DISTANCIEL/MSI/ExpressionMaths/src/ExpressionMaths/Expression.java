package ExpressionMaths;



public abstract class Expression {
    public abstract void afficher();


    public String getType() {

        return this.getClass().getSimpleName();
    }

    public abstract int eval();

    public abstract Expression deriver(Variable var);

}
