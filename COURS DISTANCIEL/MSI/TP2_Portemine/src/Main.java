import javax.sound.sampled.Port;

public class Main {
    public static void main(String[] args) {
        Mine m1 = new Mine();
        Mine m2 = new Mine();

        Portemine pm = new Portemine(m1);
        Portemine pm2 = new Portemine(m1);

        pm.ecrire("Test 1 PM1");
        pm.ecrire("Test 2 PM2");

        pm2.ecrire("Test 3 PM2");
        pm2.ecrire("Test 4 PM2");

        pm.ajouterMine(m2);
        pm2.ajouterMine(m2);

        pm.ecrire("Test 5 PM");
        pm.ecrire("Test 6 PM");

        pm2.ecrire("Test 7 PM2");
        pm2.ecrire("Test 8 PM2");
    }
}
