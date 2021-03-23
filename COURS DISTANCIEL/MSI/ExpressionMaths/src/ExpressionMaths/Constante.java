package ExpressionMaths;


public class Constante extends Expression {

    private int cste;

    //Initialisation de la constante
    public Constante(int cste) {
        this.cste = cste;
    }

    private int getCste() {

        return this.cste;
    }
    //Affichage de la constante
    public void afficher() {

        System.out.print(cste);
    }
    //Affichage du "calcul"
    public int eval(){
        return cste;
    }

    //Derivation en fonction de la variable : une constante retourne 0
    public Expression deriver(Variable var){
        return new Constante(0);
    }


}
