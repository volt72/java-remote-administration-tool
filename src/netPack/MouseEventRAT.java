package netPack;

/**
 * The class will hold information about mouse events that will be send over the network
 * Like a mousemovent or click of a mouse button
 * 
 * @author Carl
 *
 */
public class MouseEventRAT extends EventRAT{
	
	//The x coordinate for were the mouse is
	private int x;
	//The y coordinate for were the mouse is
	private int y;
	//mc stands for mouseclick, were mc = 1 -> leftclick, mc = 2 -> right click
	private int mc;
	
	public MouseEventRAT(int x, int y, int mc){
		this.setX(x);
		this.setY(y);
		this.setMc(mc);
	}
	public MouseEventRAT(int x, int y){
		this.setX(x);
		this.setY(y);
	}
	public MouseEventRAT(int mc){
		this.mc = mc;
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
}
