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
public class TroisNombres {
  private int a;
  private int b;
  private int c;
 
  public TroisNombres(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
 
  public void affiche() {
    System.out.println("a: " + a + ", b: " + b + ", c: " + c);
  }
 
  public void setValeurs(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
 
  public void diviseAparB() {
    if(b == 0){
        System.out.println("Division par 0 impossible !");
    }
    else{
        System.out.println("La division de " + a + " par " + b + " est égale à: " + a/b);
    }
  }
 
  public void lePlusGrandEntreAetB() {
    if(a > b){
        System.out.println("a est plus grand que b");
    }
    else if(a < b) {
        System.out.println("b est plus grand que a");
    }
    
    else{
        System.out.println("a et b sont égaux");
    }
  }
  
    public void reordonneParOrdreCroissantAetB(){
        if(a > b){
            int c = a;
            a = b;
            b = c;

        }
    }
    public void reordonneParOrdreCroissantABetC(){
        if(b > c){
          int d = b;
          b = c;
          c = d;
      }
    
        if(a > b){
            int d = a;
            a = b;
            b = d;

      }
    }
    
    public void lePlusGrandEntreABetC(){
        if(a == b && b == c){
            System.out.println(a + " = " + b + " = " + c);
        }
        
    }
  
}
