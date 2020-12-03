package exo3;



public class A {
    private char c;
    
    public A(char c) {
        this.c = c;
    }
    
    public void action(){
        if (Character.isUpperCase(c))
            c = Character.toLowerCase(c);
        else
            c=Character.toUpperCase(c);
    }
}
