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

