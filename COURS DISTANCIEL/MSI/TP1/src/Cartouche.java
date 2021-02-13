public class Cartouche {
    private final String couleur;
    private int niveau;
    private boolean estUtilise;

    public Cartouche(String couleur){
        this.couleur = couleur;
        estUtilise = false;
        niveau = 3;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean estVide(){
        return(this.niveau==0);
    }

    public void utiliserEncre(){
        if(niveau > 0){
            niveau--;
        }
    }

    public boolean getEstUtilise(){
        return estUtilise;
    }

    public void setEstUtilise(boolean u){
        estUtilise = u;
    }
}
