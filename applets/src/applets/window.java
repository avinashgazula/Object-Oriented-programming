package applets;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class window extends JFrame implements AdjustmentListener{

	private JSlider slider;
	private JScrollBar scrollbar;
	private oval myPanel;
	
	public window(){
		super("Oval Slider");
		this.setLayout(new GridLayout());
		
		myPanel = new oval();
		myPanel.setBackground(Color.CYAN);
		
		scrollbar = new JScrollBar(Scrollbar.HORIZONTAL, 50, 0, 0, 100);
		add(scrollbar,BorderLayout.SOUTH);
		scrollbar.addAdjustmentListener(this);

		slider = new JSlider(SwingConstants.VERTICAL,0,200,10);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(10);
		
		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged( ChangeEvent e){
						myPanel.setD(slider.getValue());
					}
				}
				);
		
		add(slider,BorderLayout.EAST);
		add(myPanel,BorderLayout.CENTER);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		this.setSize(100,10*scrollbar.getValue());
	}
	
}
