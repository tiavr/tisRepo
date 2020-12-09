/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo1;
import java.util.*;

/**
 *
 * @author tiavr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> chenil;
        chenil = new ArrayList<>();
        
        Chien chien = new Chien("Medor");
        Chat chat = new Chat("Tom");
        Poisson p = new Poisson("Nemo");
        
        chenil.add(chien);
        chenil.add(chat);
        chenil.add(p);
        
        for(Animal animal : chenil){
            System.out.println(animal.toString());
        }
    }
    
}
