package ExpressionMaths;


public class Variable extends Expression {
    private String var;

    //Initialisation variable
    public Variable(String var) {
        this.var = var;
    }

    private String getVar() {

        return this.var;
    }


    //Affichage de la variable
    public void afficher() {

        System.out.print(var);
    }
    //Transformation de la variable x = 1 et y =2
    public int eval(){
        if(var == "x"){
            return 1;
        }
        if(var == "y"){
            return 2;
        }
        else{
            return 0;
        }
    }
    // Derivation en fonction de la variable en param verifiant si elle correspond a la variable de la classe
    public Expression deriver(Variable var){
        if(this.var == var.getVar()){
            return new Variable("1");
        }
        else{
            return new Variable("0");
        }
    }
}
