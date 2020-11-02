/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;

/**
 *
 * @author tiavr
 */
public class TestBanque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banque t = new Banque();
        System.out.println(t.versChaineDeCaracteres());
        System.out.println(t.avoirTotal());
        CompteBancaire client = t.getClient(0);
        client.retrait(150);
        t.afficheDebit();
        t.afficheNumeroDebitPlancher();
    }
    
}
