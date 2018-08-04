package Craps;

public class CrapsPlay extends Craps {
	
	int dice1,dice2;

	public CrapsPlay() {
		// TODO Auto-generated constructor stub
	}
	
	public void gamePlay(){
		dice1=RollDice();
		dice2=RollDice();
		int sum = dice1 + dice2;
	//	System.out.println(sum);
		if(sum==7||sum==11)
			System.out.println("You Win");
		else if (sum==2||sum==3||sum==12)
			System.out.println("You Lose");
		else{
		//	System.out.println("hello");
		//	System.out.println(sum);
			setPoint(sum);
			do{
				dice1=RollDice();
				dice2=RollDice();
				sum = dice1 + dice2;
				//System.out.println(sum);
				
			}while(sum!=7 && sum!=getPoint());
			if(sum==7){
				System.out.println("You Lose");
			}
			else if (sum==getPoint()){
				System.out.println("You Win");
			}
				
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			(new CrapsPlay()).gamePlay();
		}
		catch(Exception e){
			System.out.println("ERROR!!");
		}

	}

}
