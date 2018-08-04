
import java.util.Random;
import java.util.Scanner;
public class StrikeBallGame7 {

	int strike(int[] r,int[] n)
	{
		int count=0;
		for(int i=0;i<3;i++)
		{
			if(r[i]==n[i])
			count++;
		}
		return count;
	}
	int ball(int[] r,int[] n)
	{
		int count=0;
		for(int i=0;i<3;i++)
		{
			if(n[i]!=r[i])
			{
				for(int j=0;j<3;j++)
				{
					if(j!=i)
					{
						if(n[i]==r[j])
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) { 
		StrikeBallGame7 obj=new StrikeBallGame7();
		Scanner read=new Scanner(System.in);
		Random rand=new Random();
		
		int count=0;
		int[] r=new int[3];
		int[] n=new int[3];
		for(int i=0;i<3;i++)
		{
			r[i]=1+(rand.nextInt(8));
			do
			{
				if(count!=0)
				{
					r[i]=1+(rand.nextInt(8));
				}
				for(int j=0;j<i;j++)
				{
					if(r[j]==r[i])
					count++;
				}	
			}while(count!=0);
		}
		int m=100,no=0;
		while(true)
		{
			m=m-no;
			no=5;
			if(m==0)
			{
				break;
			}
			System.out.println("Enter your numbers");
			for(int i=0;i<3;i++)
				n[i]=read.nextInt();
			System.out.println(obj.strike(r,n)+" strikes");
			System.out.println(obj.ball(r,n)+" balls");
			
			if(obj.strike(r,n)==3)
			{
				System.out.println("You win!!\nYour score is "+m);
				break;
			}
			else
			{
				System.out.println("ERR!!Try Again");
				
			}
		}
		
	}

}
