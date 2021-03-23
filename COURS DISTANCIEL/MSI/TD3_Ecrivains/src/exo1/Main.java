package exo1;

public class Main {
    public static void main(String[] args) {
        EcrivainDeNouvelles ecrivain1 = new EcrivainDeNouvelles("Marc");
        EcrivainDeRomans ecrivain2 = new EcrivainDeRomans("Antoine");

        ecrivain2.ecrireOuvrage();
        ecrivain1.ecrireOuvrage();
    }
}
