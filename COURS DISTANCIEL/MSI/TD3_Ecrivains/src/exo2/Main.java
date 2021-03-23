package exo2;

public class Main {
    public static void main(String[] args) {
        EcrivainManiaque ecrivain = new EcrivainManiaque();
        Crayon crayon = new Crayon();
        Feutre feutre = new Feutre();

        ecrivain.ecrireOuvrage(crayon);
        ecrivain.ecrireOuvrage(feutre);
    }
}
