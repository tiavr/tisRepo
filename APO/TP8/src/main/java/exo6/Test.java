/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo6;

/**
 *
 * @author tiavr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "oui";
        while(s1.equals("oui")){
            System.out.println("Entrez une chaine de caractère");
            String s2 = LectureClavier.lireChaine();
            System.out.println("chaine lue : " + s2);
            Boolean p = Palindrome.estPalindrome(s2);
            System.out.println(p);
            System.out.println("Voulez vous continuer ?");
            s1 = LectureClavier.lireChaine();
        }
        
    }
    
}
