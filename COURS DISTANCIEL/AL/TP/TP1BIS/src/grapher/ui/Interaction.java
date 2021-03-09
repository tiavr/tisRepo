package grapher.ui;

import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;

public class Interaction extends MouseInputAdapter {
    Grapher grapher;
    Point position;
    Point down;
    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

    enum State {
        IDLE, ZOOM_IN_DRAG, ZOOM_OUT, DRAG, DRAG_ZOOM_OUT;
    }
    State state = State.IDLE;

    public Interaction (Grapher g){
        grapher = g;
        grapher.addMouseMotionListener(this);
        grapher.addMouseListener(this);
        grapher.addMouseWheelListener(this);

    }


    public void mousePressed(MouseEvent e){
        position = e.getPoint();
        switch(state){
            case IDLE:
                //MAJ de l'état en fonction du bouton et récupération de la position initial du click
                if(e.getButton() == MouseEvent.BUTTON1){
                    state = State.ZOOM_IN_DRAG;
                    down = position;
                }
                if(e.getButton() == MouseEvent.BUTTON3){
                    state = State.ZOOM_OUT;
                    down = position;
                }
            default: break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        switch(state){
            case ZOOM_IN_DRAG:
                //Zoom IN si clic gauche
                if(e.getButton() == MouseEvent.BUTTON1){
                    grapher.zoom(e.getPoint(), 5);
                    state = State.IDLE;
                    break;
                }
            case ZOOM_OUT:
                //Zoom out si clic droit
                if(e.getButton() == MouseEvent.BUTTON3){
                    grapher.zoom(e.getPoint(), -5);
                    state = State.IDLE;
                    break;
                }
            case DRAG:
                grapher.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                state = State.IDLE;
                break;

            case DRAG_ZOOM_OUT:
                grapher.zoom(down, e.getPoint());
                state = State.IDLE;
                break;
            default:break;
        }
    }



    @Override
    //DRAG avec clic gauche
    public void mouseDragged(MouseEvent e) {
        position = e.getPoint();
        switch (state){
            case ZOOM_IN_DRAG:
                //RECUPERATION DE LA DISTANCE
                if(  (down.distance(position) > 5)){
                    //Changement de curseur
                    grapher.setCursor(cursor);
                    //Déplacement de la fenêtre
                    grapher.translate( (int) (down.getX() - position.getX()), (int) (down.getY() - position.getY()));
                    //Changement de l'état
                    state = State.DRAG;

                }
                break;
            case DRAG:

                grapher.setCursor(cursor);
                grapher.translate( (int) (position.getX() - down.getX()), (int) (position.getY() - down.getY()));
                down = e.getPoint();
                break;
            case ZOOM_OUT:
                if(down.distance(position) > 5){
                    state = State.DRAG_ZOOM_OUT;
                }
            case DRAG_ZOOM_OUT:
                grapher.repaint();
                break;

            default:break;
        }
    }

    @Override
    //Zoom avec la molette
    public void mouseWheelMoved(MouseWheelEvent e) {
        switch (state){
            case IDLE:
                //ZOOM IN
                if(e.getWheelRotation() < 0){
                    grapher.zoom(e.getPoint(), 5);
                    state = State.IDLE;
                }
                //ZOOM OUT
                else{
                    grapher.zoom(e.getPoint(), -5);
                    state = State.IDLE;
                }
            default:break;
        }
    }

    public void drawFeedback(Graphics2D g2){ ;
        switch (state){
            case DRAG_ZOOM_OUT:
                g2.drawRect((int)down.getX(), (int)down.getY(), (int) (position.getX() - down.getX()), (int) (position.getY() - down.getY()));
                break;
            default:break;
        }

    }

}

