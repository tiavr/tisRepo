7.4)
public boolean isPangramme(String str){
	String m = str.toLowerCase();
	String[] alphabet = {a, b, c, etc};
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

Comment utiliser a b c etc
String[] alphabet = {a, b, c, etc}

String m = str.toLowerCase();

Comment parcourir les lettres :
utiliser un compteur i (0 à 25)

while (i < 2 && rep)
if(m.contains(alphabet[i]))
	i++;
else{ rep = false;}

7.6)
public class TableauEntiersTrié{
	private int T[];
public TableauEntiersTrié(int [] tab1, int[] tab2){
	int i = 0, j = 0, k = 0;
	T = new int[tab1.length + tab2.length]
	while( i < tab1.length && j < tab2.length){
		if(tab1[i] < tab2[j]){
			T[k] = tab1[i];
			i++;
		}
		else{
			T[k] = tab2[j];
			j++;
			
		}
		k++;
	}
	
	for(; i < tab1.length; i++){
		T[k] = tab1[i];
		k++;
	}
	for(; j < tab2.length; j++){
		T[k] = tab1[j];
		k++;
	}
}

}

tab1 = {2, 9, 13, 22};
tab2 {1, 5, 7, 10, 14, 35, 42};

But du constructeur est de réserver la place mémire nécessaire à T
T doit avoir une taille = tab1.length + tab2.length

remplir T de manière à ce que T soit trié.

6.2)

public boolean estTrié(){
	int i = 0;
	boolean rep = true;
while((i < T.length -1) && rep)}

}

6.4)

public int nbValMaj(){
	int k, nbAppMax, valMaj, nbAppCour, valCour;
	
	nbAppMax =1;
	valMaj = T[0];
	k = 0;
	while(k < T.length){
		valCour = 1;
		nbApp = 1;
		k++;
		while((k < T.length) && (T[k] == valCour)){
			nbApp++;
			k++;
		}
		if (nbApp > nbAppMax){
			nbAppMax = nbApp;
			valMaj = valCour;
		}
	}
	return nbAppMax;
}


public void elimineDupliques(){
	int tmpT[];
	int nbelem,i,j;
	// Calcul de nbelem
	nbelem =1;
	for(i = 1; i< T.length; i++){
		if(T[i] != T[i-j]{
			nbelem++;
		}
	}
	//Allocation memoire et remplissage de tmpT
	tmpT = new int [nbelem];
	//remplir tmpT
	tmpT[0] = T[0];
	j = 1;
	for(i=1; i < t.length; i++){
		if(T[i] != T[i-j]){
			tmpT[j] = T[i];
			j++;
		}
	}
	T = tmpT;
}


public void afficheLargeur(int n){
	for (int i = 0; i < n; i++){
		System.out.println(T[i]);
	}
}

public void afficheLargeur(int n){
	int i = 0, j = 0;
	while(i < T.length && (j<n)){
		String s = "";
		while(j < n){
			s+= T[i] + " ";
			j++;
		}
		System.out.println(s);
		i++;
	}
}

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
}


