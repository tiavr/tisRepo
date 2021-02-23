package grapher.ui;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Cursor;

import java.awt.event.*;
import javax.swing.event.*;


public class Interaction 
	extends MouseInputAdapter
	implements MouseWheelListener {

	final int D_DRAG = 5;
		
	final Cursor hand_cursor = new Cursor(Cursor.HAND_CURSOR);
	final Cursor default_cursor = Cursor.getDefaultCursor();
		
	enum State { IDLE, ZOOMIN_OR_PAN, PAN, ZOOMOUT_OR_SELECT, SELECT }
	protected State state = State.IDLE;
		
	protected Point down;
	protected Rectangle feedback = null;
		
	protected Grapher grapher;
	
	public Interaction(Grapher g) {
		grapher = g;
		grapher.addMouseListener(this);
		grapher.addMouseMotionListener(this);
		grapher.addMouseWheelListener(this);
	}

	public void mousePressed(MouseEvent e) {
		Point position = e.getPoint();
		switch(state) {
		case IDLE:
			switch(e.getButton()) {
			case MouseEvent.BUTTON1:
				down = position;
				state = State.ZOOMIN_OR_PAN;
				break;
			case MouseEvent.BUTTON3:
				down = position;
				state = State.ZOOMOUT_OR_SELECT;
				break;
			}
		default:
			break;
		}
	}

	public void mouseReleased(MouseEvent e) {
		Point position = e.getPoint();
		switch(state) {
		case ZOOMIN_OR_PAN:
			if(e.getButton() == MouseEvent.BUTTON1) {
				grapher.zoom(position, 5);
				state = State.IDLE;
			}
			break;
		case ZOOMOUT_OR_SELECT:
			if(e.getButton() == MouseEvent.BUTTON3) {
				grapher.zoom(position, -5);
				state = State.IDLE;
			}
			break;
		case PAN:
			if(e.getButton() == MouseEvent.BUTTON1) {
				grapher.setCursor(default_cursor);
				state = State.IDLE;
			}
			break;
		case SELECT:
			if(e.getButton() == MouseEvent.BUTTON3) {
				grapher.zoom(down, position);
				state = State.IDLE;
				feedback = null;
			}
			break;
		default:
			break;
		}
			
	}
		
	public void mouseDragged(MouseEvent e) {
		Point position = e.getPoint();
		switch(state) {
		case ZOOMIN_OR_PAN:
			if(position.distance(down) > D_DRAG) {
				grapher.setCursor(hand_cursor);
				state = State.PAN;
			}
			break;
		case ZOOMOUT_OR_SELECT:
			if(position.distance(down) > D_DRAG) {
				state = State.SELECT;
			}
			break;
		case PAN:
			grapher.translate(position.x - down.x, position.y - down.y);
			down = position;
			break;
		case SELECT:
			feedback = new Rectangle(down);
			feedback.add(position);
			grapher.repaint();
			break;
		default:
			break;
		}
	}
	
	public void mouseWheelMoved(MouseWheelEvent e) {
		grapher.zoom(e.getPoint(), e.getWheelRotation());
	}
	
	public void drawFeedback(Graphics2D g2) {
		if(feedback != null) {
			g2.draw(feedback);
		}
	}
}
