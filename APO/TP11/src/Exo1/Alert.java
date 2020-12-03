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
public class Alert {
    private Calendar date;
    private Type type;
    private String cause;

    public Alert(Calendar date, Type type, String cause) {
        this.date = date;
        this.type = type;
        this.cause = cause;
    }
    
    public int compareTo(Alert a){
        int nb = 0;
        if(this.date.compareTo(a.getDate()) == 0 && this.type == a.getType()){
            nb = 0;
        }
        if(this.date.compareTo(a.getDate()) == 1){
            nb = -1;
        }
        if(this.date.compareTo(a.getDate()) == -1){
            nb = 1;
        }
        if(this.date.compareTo(a.getDate()) == 0 && this.type == Type.SEVERE && a.getType() == Type.BENINE){
            nb = -1;
        }
        if(this.date.compareTo(a.getDate()) == 0 && this.type == Type.BENINE && a.getType() == Type.SEVERE){
            nb = 1;
        }
        return nb;
    }

    /**
     * @return the date
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * @return the cause
     */
    public String getCause() {
        return cause;
    }
    
    
}
