/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

/**
 *
 * @author tiavr
 */
public class Palindrome {
    public static boolean estPalindrome(String s){
        int i = 0;
        String m = "";
        for(int c = 0; c < s.length(); c++){
            if(s.charAt(c) != ' '){
                m = m + s.charAt(c);
            }
        }
        m = m.toLowerCase();
        int j = m.length() - 1;
        
        
        boolean verif = true;
        while(i < j && verif){
            if(m.charAt(i) == m.charAt(j)){
                i++;
                j--;
            }
            else{
                verif = false;
            }
        }
        return verif;
    }
}
