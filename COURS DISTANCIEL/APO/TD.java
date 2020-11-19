import java.util.*;
public class TableauEntiers {
    private int [] T;
     
    public TableauEntiers(int taille, int min, int max) {
        int i;
        T = new int[taille];
        for(i=0;i<T.length;i++)
            T[i] = Outils.nombreAleatoire(min, max);
    }
 
    public void affichage(){
        int i;
        String s="";
        for(i=0;i<T.length;i++)
            s = s + T[i] + " ";
        System.out.println(s);
    }
    
    public int positionMinimum(int debut){
        int pos_min = debut;
        for(int j = debut + 1; j < T.length; ++j){
            if(T[j] < T[pos_min]){
                pos_min = j;
            }
        }
        return pos_min;
    }
    
    public void echanger(int i, int j){
        int temp;
        temp = T[i];
        T[i] = T[j];
        T[j] = temp;
    }
    
    public void triSelection(){
        int k, pos_min;
        for(k = 1; k < T.length; ++k){
            pos_min = positionMinimum(k-1); 
            echanger(k-1, pos_min);
        }
    }
    //question 7.4
    //n log(n)
}
public class EnsembleEntiers{
    private ArrayList<Integer> liste;

    public EnsembleEntiers(){
        liste = new ArrayList<Integer>();
    }

    public int cardinal(){
        return liste.size();
    }

    public boolean contient(int n){
        Integer i = new Integer(n);
        return liste.contains(i);
    }

    public void ajouter(int n){
        if(!this.contient(n)){
            Integer i = new Integer(n);
            liste.add(i);
        }
    }

    public void supprimer(){
        if(this.contient(n)){
            Integer i = new Integer(n);
            liste.remove(i);
        }
    }

    public int getValeur(int i){
        return liste.get(i).getValue();
    }

    public void vider(){
        liste.clear();
    }

    public boolean egale(EnsembleEntiers e){
        if(this.cardinal() != e.cardinal()){
            return false;
        }
        int i = 0;
        boolean check = true;
        while(i < this.cardinal() && check){
            check = this.contient(e.getValeur(i));
            i++;
        }s
        return check;
    }
    public boolean egale(EnsembleEntiers e){
        if(this.cardinal() != e.cardinal()){
            return false;
        }
        int i = 0;
        boolean check = true;
        while(i < this.cardinal() && this.contient(e.getValeur(i))){
            i++;
        }
        return (i == this.cardinal()); //comparaison entre 2 element avec == renvoie boolean
    }

    public EnsembleEntiers union(EnsembleEntiers e){
        EnsembleEntiers ret;
        // on parcours this et on ajoute ses elements dans ret
        for(int i = 0; i < this.cardinal(); i++){
            ret.ajouter(this.getValeur(i));
        }
        //on parcourt e et on ajoute ses éléments dans ret
        for(int i = 0; i < this.cardinal(); i++){
            ret.ajouter(e.getValeur(i));
        }
        return ret
    }
}