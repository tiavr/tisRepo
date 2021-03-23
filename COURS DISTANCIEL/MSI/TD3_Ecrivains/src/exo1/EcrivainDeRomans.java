package exo1;

public class EcrivainDeRomans extends Ecrivain{
    public EcrivainDeRomans(String n) {
        super(n);
    }

    @Override
    public void ecrireOuvrage() {

        System.out.println("Ceci est un roman écrit par " + getNom());
    }
}
