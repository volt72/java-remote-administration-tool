package netPack;

import java.io.Serializable;

/**
 * The class will hold information about mouse events that will be send over the network
 * Like a mousemovent or click of a mouse button
 * 
 * @author Carl
 *
 */
public class MouseEventRAT extends EventRAT implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//The x coordinate for were the mouse is
	private int x;
	//The y coordinate for were the mouse is
	private int y;
	//mc stands for mouseclick, were mc = 1 -> leftclick, mc = 2 -> right click
	private int mc;
	
	private boolean mouseMoved;
	private boolean mouseClicked;
	
	public MouseEventRAT(int x, int y, int mc){
		this.setX(x);
		this.setY(y);
		this.setMc(mc);
		this.setMouseMoved(true);
		this.setMouseClicked(true);
	}
	public MouseEventRAT(int x, int y){
		this.setX(x);
		this.setY(y);
		this.setMouseMoved(true);
		this.setMouseClicked(false);
	}
	public MouseEventRAT(int mc){
		this.mc = mc;
		this.setMouseMoved(false);
		this.setMouseClicked(true);
	}
	/** 
	 *  Bellow this comment is autogenerated getters and setters from eclipse..
	 */
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getMc() {
		return mc;
	}

	public void setMc(int mc) {
		this.mc = mc;
	}
	public boolean isMouseMoved() {
		return mouseMoved;
	}
	public void setMouseMoved(boolean mouseMoved) {
		this.mouseMoved = mouseMoved;
	}
	public boolean isMouseClicked() {
		return mouseClicked;
	}
	public void setMouseClicked(boolean mouseClicked) {
		this.mouseClicked = mouseClicked;
	}	
}
