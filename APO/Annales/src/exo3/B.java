package exo3;


public class B {
    private A[] t;
    
    public B(String s) {
        t = new A[s.length()];
        for (int i=0; i < s.length();i++) {
            t[i] = new A(s.charAt(i));
        }
    }
    
    public void action(){
        for (int i=0; i < t.length / 2; i++) {
            t[i].action();
        }
    }
}
