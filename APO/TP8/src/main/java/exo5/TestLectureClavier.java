/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo5;

/**
 *
 * @author tiavr
 */
public class TestLectureClavier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("entrez un caractère :");
        char c = LectureClavier.lireChar();
        System.out.println("caractère lu : " + c);

        String s = LectureClavier.lireChaine("entrez une chaine :");
        System.out.println("chaine lue : " + s);

        System.out.println("entrez un entier : ");
        int i = LectureClavier.lireEntier();
        System.out.println("entier lu : " + i);

        float f = LectureClavier.lireFloat("entrez une réel (float) : ");
        System.out.println("réel (float) lu : " + f);

        System.out.println("entrez une réel (double) : ");
        double d = LectureClavier.lireDouble();
        System.out.println("réel (double) lu : " + d);

        System.out.println("entrez une réponse O/N : ");
        boolean b = LectureClavier.lireOuiNon();
        System.out.println("booleen lu : " + b);
    }
    
}
