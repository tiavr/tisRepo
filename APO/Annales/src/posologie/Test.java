/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posologie;

/**
 *
 * @author phantomr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Posologie[] p = new Posologie[2];
        p[0] = new Posologie("adulte", "gélule", 2, 3);
        p[1] = new Posologie("insuffisance cardiaque", "gélule", 1, 3);
        Medicament m1 = new Medicament("Morpheus", p);

        p = new Posologie[3];
        p[0] = new Posologie("adulte", "goutte", 10, 1);
        p[1] = new Posologie("insuffisance rénale", "N/A", -1, 0);
        p[2] = new Posologie("moins de 6 ans", "goutte", 1, 5);
        Medicament m2 = new Medicament("Soma", p);

        System.out.println(m1.getNom() + " a " + m1.getNbContreIndications() + " contre-indication(s)");
        System.out.println(m2.getNom() + " a " + m2.getNbContreIndications() + " contre-indication(s)");

        Posologie pos = m1.getPosologie("adulte");
        System.out.println("Forme pour adulte du médicament " + m1.getNom() + " : " + pos.getForme());
        pos = m1.getPosologie("insuffisance cardiaque");
        System.out.println("Nombre de " + pos.getForme() + "s du médicament " + m1.getNom() + " en cas d'insuffisance cardiaque : " + pos.getQuantite() + " (" + pos.getFrequence() + " fois par jour)");
        pos = m2.getPosologie("insuffisance rénale");
        System.out.println("En cas d'insuffisance rénale, la forme du médicament " + m2.getNom() + " est : " + pos.getForme());
        pos = m2.getPosologie("nourrisson");
        if (pos==null) {
            System.out.println("Pas de posologie pour les nourrissons !");
        }

        System.out.print(m1);
        System.out.print(m2);
    }
    
}
