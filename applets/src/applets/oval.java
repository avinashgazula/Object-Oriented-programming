package applets;

import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class oval extends JPanel {

	int d=100;
	static int a=100;
	
	public void init(){
		
	}
	
	public void setD(int newD){
		d= (newD>0 ? newD : 0);
		repaint();
	}
	
	public void paint(Graphics g){
		super.paint(g);

		g.fillOval(30,30, d, d);

	}

}

