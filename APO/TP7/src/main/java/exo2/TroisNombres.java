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
        if(a <= b && a <= c){
          if (b>c){
              int tmp = b;
              b =c;
              c = tmp;
          }
          
       }
        else{
            if(b<=a && b<=c){
                int tmp = a;
                a=b;
                b=tmp;
            }
            if (b>c){
              int tmp = b;
              b =c;
              c = tmp;
            }
        else{
            int tmp = a;
            a = c;
            c = tmp;
            
            if (b>c){
              int tmp2 = b;
              b =c;
              c = tmp2;
            }
        }
        }
    }
    
    public void lePlusGrandEntreABetC(){
        if(a == b && b == c){
            System.out.println(a + " = " + b + " = " + c);
        }
        
    }
  
}
