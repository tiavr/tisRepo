/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premiereclasse;

/**
 *
 * @author tiavr
 */
public class Point {
    private int abs;
    private int ord;
    
    public Point(){
        this.abs = 1;
        this.ord = 1;
    }
    
    public Point(int abs, int ord){
        this.abs = abs;
        this.ord = ord;
    }
    public void affiche(){
        System.out.println(abs);
        System.out.println(ord);
    }
    
    public void setPoint(int x, int y){
        abs = x;
        ord = y;
    }
    
    public void translate(int x, int y){
        abs = abs + x;
        ord = ord + y;
    }
    
    public boolean origin(){
        if(abs == 0 && ord == 0){
            System.out.println("True");
            return true;
        }
        return false;
    }
    
    public boolean equal(Point p){
        if(this.abs == p.abs && this.ord == p.ord){
            System.out.println("True");
            return true;
        }
        
        return false;
    }
    
    public void setPoint(Point q){
        if(!(this.abs == q.abs && this.ord == q.ord)){
            this.abs = q.abs;
            this.ord = q.ord;
        }
    }
    
    public Point symmetry(){
        Point q;
        q = new Point();
        q.abs = this.ord;
        q.ord = this.abs;
        return q;
    }
    
}
