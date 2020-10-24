/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo4;

/**
 *
 * @author tiavr
 */
public class ChainesEnA {
    private String[] chaines = {"abracadabra", "et voila", "ma camera", "ahahah", "joli tour", "arabesque"};
 
    public void afficheTable() {
      for(String value : chaines){
          System.out.println(value + " ");
      }
    }

    public void enMajuscules() {
      for(String value : chaines){
         value.toUpperCase();
      }
    }

    public int compteA(String s) {
      int val = 0;
      for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) == 'A'){
              val += 1;
          }    
      }
      return val;
    }

    public void afficheNombreA() {
        for(String value : chaines){
            System.out.println("La chaine : " + value + " contient " + compteA(value) + " fois la lettre A.");
        }
    }

    public void affiche3As() {
        for(String value : chaines){
            if(compteA(value) >= 3){
                System.out.println(value);
            }
        }
    }
 
}

