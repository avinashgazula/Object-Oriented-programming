package applets;

import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class events extends Applet implements ActionListener {
	
	String name;
	String gender;
	int age;

	Label nameLabel;
	Label ageLabel;
	Label genderLabel;
	TextArea nameInput;
	JButton submit;
	Choice ageInput;
	CheckboxGroup genderInput;
	
	public void init() {
		
		setSize(300,200);
		
		nameLabel = new Label("Enter Name :");
		ageLabel = new Label("Enter Age : ");
		genderLabel = new Label("Enter Gender : ");
		
		nameInput = new TextArea(2,20);
		
		submit = new JButton("Submit");
		
		ageInput = new Choice();
		ageInput.addItem("10");
		ageInput.addItem("11");
		ageInput.addItem("12");
		ageInput.addItem("13");
		ageInput.addItem("14");
		
		genderInput = new CheckboxGroup();
		submit.setBounds(200, 200, 50, 250);
		
	//	this.setLayout(new GridLayout());

		
		add(nameLabel);
		add(nameInput);
		add(genderLabel);
		add((new Checkbox("Male",genderInput,true)));
		add((new Checkbox("Female",genderInput,false)));
		add(ageLabel);
		add(ageInput);
		add(submit);
		
		submit.addActionListener(this);
	}
	
	public void paint(Graphics g){
		
		g.drawString("Name : "+name, 20,150);
		g.drawString("Age : "+age, 20,170);
		g.drawString("Gender : "+gender, 20,190);
	}

	public void actionPerformed(ActionEvent a){
		
		name = nameInput.getText();
		gender = genderInput.getSelectedCheckbox().getLabel();
		age = Integer.parseInt(ageInput.getSelectedItem());
		JOptionPane.showMessageDialog(this,"hello");
		repaint();
		
	}

	
	

}
