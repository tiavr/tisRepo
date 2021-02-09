package notification.fc;

import notification.ui.Window;

import java.util.*;

import static java.lang.Math.random;


public class Variable extends Thread implements Callback{
	//Suppresion de la dépendance
	//Window window;
	double value = 0.;
	List<Callback> callbacks = new LinkedList<Callback>();
	
	public Variable() {
		//Suppresion de la dépendance
		//window = w;
		start();
	}
	
	public void run() {
		while(true) {
			double v = getValue();
			if(random() > .5) {
				v += random();
			} else {
				v -= random();
			}
			setValue(v);
			try {
				sleep((long)(1000*random()));
			} catch(InterruptedException e) {
				break;
			}
		}
	}
	
	public double getValue() {
		return value;
	}
	public void setValue(double new_value) {
		value = new_value;
		System.err.print("fc.Variable: ");
		System.err.println(value);
		// Notification des abonnés du changement de la value
		for(Callback callback: callbacks){
			callback.valueChange(value);
		}

		//Suppresion de la dépendance
		//window.valueChange(value);
	}
		//Méthode d'abonnement
	public void addCallback(Callback callback){
		callbacks.add(callback);
	}
		//Implémentation de l'interface necessite implementation de ses methodes
	@Override
	public void valueChange(double value) {

	}
}
