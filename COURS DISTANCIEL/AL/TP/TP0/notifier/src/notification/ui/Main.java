package notification.ui;

import notification.fc.Variable;
import notification.ui.Window;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		Window window = new Window();
		Window window2 = new Window();
		Variable variable = new Variable();
		//Abonnement à la variable
		variable.addCallback(window);
		variable.addCallback(window2);
		//Boucle qui met à jour l'affichage en continu
		while(true){
			double val = variable.getValue();
			window.valueChange(val);
			window2.valueChange(val);
			window2.setLocation(130,0);
			i = i+1;
			System.out.println("Nombre de tours : " + i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				break;
			}
		}

	}
}
