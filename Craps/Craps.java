package Craps;

import java.util.Random;

public class Craps extends CrapsCode{

	private int point = 0;
	public Craps() {
		// TODO Auto-generated constructor stub
	}
	
	public int RollDice(){
		Random rand = new Random();
		return 1+rand.nextInt(6);
	}
	
	public void setPoint(int a){
		this.point=a;
	}
	
	public int getPoint(){
		return this.point;
	}
	
	

}
