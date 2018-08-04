package applets;

import java.awt.*;
import javax.swing.*;

/*<applet code = "test.class" width = "300" height = "300">
</applet>*/

@SuppressWarnings("serial")
public class test extends JApplet {

	double sum,d1,d2;
	
	public void init(){
		String fn= JOptionPane.showInputDialog("Enter first number");
		String sn= JOptionPane.showInputDialog("Enter second number");
		d1=Double.parseDouble(fn);
		d2=Double.parseDouble(sn);
		sum= d1+ d2;
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("hello", 25, 25);
		
		g.drawString("sum ="+sum, 50, 50);
	}

}
