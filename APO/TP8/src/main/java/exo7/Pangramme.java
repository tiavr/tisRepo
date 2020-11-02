/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo7;

/**
 *
 * @author tiavr
 */
public class Pangramme {
    public boolean isPangramme(String str){
	String m = str.toLowerCase();
	String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	boolean rep = true;
	int i = 0;
	while((i < alphabet.length) && rep) {
		if (m.contains(alphabet[i])) {
			i++;
		}
		else{
			rep = false;
		}
	}
	return rep;
	
}
}
