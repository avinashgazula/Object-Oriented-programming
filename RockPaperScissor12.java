
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor12 {
	
	int win(int a,int r)
	{
		switch(a)
		{
		case 0:
			if(r==0) return -1;
			if(r==1) return 0;
			else return 1;
		case 1:
			if(r==0) return 1;
			if(r==1) return -1;
			else return 0;
		case 2:
			if(r==0) return 0;
			if(r==1) return 1;
			else return -1;
		}
		return -1;
	}
	
	void thing(int a)
	{
		if(a==0)
			System.out.print("Scissor ✂️");
		else if(a==1)
			System.out.print("Rock 🤘");
		else
			System.out.print("Paper 📝");
	}

	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		Random rand=new Random();
		RockPaperScissor12 obj=new RockPaperScissor12();
		int Computer=rand.nextInt(3),r;
		do
		{
			System.out.println("Scissor(0) Rock(1) Paper(2) :");
			r=read.nextInt();
			Computer=rand.nextInt(3);
			if(r==-1)
				break;
			System.out.print("The computer is ");obj.thing(Computer);System.out.print(" You are ");obj.thing(r);
			switch(obj.win(r, Computer)){
			case -1:
				System.out.println(" It's a draw");
				break;
			case 0:
				System.out.println(" You lose");
				break;
			case 1:
				System.out.println("You win");
			}
		}while(true);
		
	}
}
