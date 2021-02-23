/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grapher.ui;

/**
 *
 * @author blasquem_ujf
 */

//import com.sun.org.apache.bcel.internal.generic.GETFIELD;
//import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Cursor;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.event.MouseEvent;
    
public class Interaction extends MouseInputAdapter {
    
   // Cursor c= new Cursor(3);
    Cursor c= new Cursor(Cursor.HAND_CURSOR);
    Cursor d= Cursor.getDefaultCursor();


Grapher grapher;
public Interaction(Grapher g){
    grapher=g;
    g.addMouseListener(this);
    g.addMouseWheelListener(this);
    g.addMouseMotionListener(this);
    
}
enum State{IDLE,ACTIVE,TRANSLATING};
State state=State.IDLE;
Point p;

    @Override
public void mousePressed(MouseEvent e){
    switch(state){
        case IDLE:
            p=e.getPoint();
            state=State.ACTIVE;
            break;
            default: break;
    }
}
    @Override
public void mouseReleased(MouseEvent e){
    switch(state){
        case ACTIVE:
            if (e.getButton()==MouseEvent.BUTTON1){
            grapher.zoom(e.getPoint(), 5);
            state=State.IDLE;
            break;
            }
                else{
                      if(e.getButton()==MouseEvent.BUTTON3){
                          grapher.zoom(e.getPoint(), - 5);
                          state=State.IDLE;
                           break;
                      } 
    }
            
        case TRANSLATING:
            grapher.setCursor(d);
            state=State.IDLE;
            break;
        default: break;
    }}

public void mouseDragged(MouseEvent e){
    switch(state){
        case ACTIVE:
        grapher.setCursor(c);
        grapher.translate((int)(e.getX()-p.getX()),(int)(e.getY()-p.getY()));
        p=e.getPoint();
        state=State.TRANSLATING;
        break;
        
        case TRANSLATING:
            grapher.translate((int)(e.getX()-p.getX()),(int)(e.getY()-p.getY()));
            p=e.getPoint();
            state=State.TRANSLATING;
            break;
        default: break;
    }
    
    }

public void mouseWheelMoved(MouseWheelEvent e) {
        switch (state) {


            case IDLE:
                if (e.getWheelRotation() < 0) {

                    grapher.zoom(e.getPoint(), 5);
                    state = State.IDLE;
                } else {
                    grapher.zoom(e.getPoint(), -5);
                    state = State.IDLE;
                }
            default:
                break;


        }
}
}
    


 

