/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exo1;
import java.util.*;

/**
 *
 * @author phantomr
 */
public class Cardio {
    private Calendar start;
    private Calendar stop;
    private List<Alert> alert;

    public Cardio(Calendar start, Calendar stop) {
        this.start = start;
        this.stop = stop;
        alert = new ArrayList<>();
    }
    
    public void ajouter(Alert newAlert){
        getAlert().add(newAlert);
    }
    
    @Override
    public String toString(){
        String s ="-start cardio : " + start.get(Calendar.DAY_OF_MONTH) + "/" + (start.get(Calendar.MONTH) + 1)  + "/" + start.get(Calendar.YEAR)  + " " + start.get(Calendar.HOUR_OF_DAY) + ":" + start.get(Calendar.MINUTE) + "\n" + 
                   "-stop cardio : "+ stop.get(Calendar.DAY_OF_MONTH) + "/" + (stop.get(Calendar.MONTH) + 1)  + "/" + stop.get(Calendar.YEAR)  + " " + stop.get(Calendar.HOUR_OF_DAY) + ":" + stop.get(Calendar.MINUTE) + "\n" + "\n" + "alertes : \n";
        for(Iterator<Alert> it = getAlert().iterator(); it.hasNext();){
            Alert a = it.next();
            s +="-date alerte : " + a.getDate().get(Calendar.DAY_OF_MONTH)+ "/" + (a.getDate().get(Calendar.MONTH) + 1)  + "/" + a.getDate().get(Calendar.YEAR)  + " " + a.getDate().get(Calendar.HOUR_OF_DAY) + ":" + a.getDate().get(Calendar.MINUTE) + "\n"
                + "-type alerte : " + a.getType() + "\n"
                + "-cause alerte : " + a.getCause() + "\n" + "\n";
        }
        return s;
    }
    
    public int positionMinimum(int debut){
        int pos_min = debut;
        for(int i = debut + 1; i < alert.size(); i++){
            if(alert.get(i).compareTo(alert.get(pos_min)) == -1){
                pos_min = i;
            }
            
        }
        return pos_min;
    }
    
    private void echanger(int i, int j){
        Alert temp;
        temp = alert.get(i);
        alert.set(i, alert.get(j));
        alert.set(j, temp);
        
    }
    
    public void triSelection(){
        int k, pos_min;
        for(k = 1; k < alert.size(); ++k){
            pos_min = positionMinimum(k-1); 
            echanger(k-1, pos_min);
        }
    }

    /**
     * @return the start
     */
    public Calendar getStart() {
        return start;
    }

    /**
     * @return the stop
     */
    public Calendar getStop() {
        return stop;
    }

    /**
     * @return the alert
     */
    public List<Alert> getAlert() {
        return alert;
    }
}
