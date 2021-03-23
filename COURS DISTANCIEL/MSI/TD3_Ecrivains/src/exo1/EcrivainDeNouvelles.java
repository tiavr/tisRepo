package exo1;

public class EcrivainDeNouvelles extends Ecrivain{

    public EcrivainDeNouvelles(String n) {
        super(n);
    }

    @Override
    public void ecrireOuvrage() {
        System.out.println("Ceci est une nouvelle écrite par " + getNom());
    }
}
