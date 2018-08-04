
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
class Account {
	
	private double duration,CDannualInterestRate=3;
	
	public Account() {
		this.duration=0;
		this.CDannualInterestRate=0;
	}
	double getDuration()
	{
		return this.duration;
	}
	void setDuration(double duration)
	{
		this.duration=duration;
	}
	double getCDannualInterestRate()
	{
		return this.CDannualInterestRate;
	}
	void setCDannualInterestRate(double CDannualInterestRate)
	{
		this.CDannualInterestRate=CDannualInterestRate;
	}
	void increaseCDannualInterestRate()
	{
		this.CDannualInterestRate+=(this.duration/3)*0.5;
	}
	
}
public class CDAccount6{
	
	//@SuppressWarnings("null")
	public static void main(String[] args){
		DateFormat dateFormat = new SimpleDateFormat("EE dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		Account[] obj = new Account[10];
		for(int i=0;i<5;i++)
		 obj[i]=new Account();
		double[] balance=new double[5];
		for(int i=0;i<5;i++)
		{
			obj[i].setCDannualInterestRate(3);
			balance[i]=1000+i*1000;
			obj[i].setDuration(3+i*3);
			obj[i].increaseCDannualInterestRate();
		} 
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Initial Balance\t Rate\t Date Created");
			System.out.println(balance[i]+"\t\t "+obj[i].getCDannualInterestRate()+"\t "+dateFormat.format(date));
			//System.out.println("hello "+obj[i].getDuration());
			for(int j=0;j<obj[i].getDuration();j++)
			{
				balance[i]+=(balance[i]*obj[i].getCDannualInterestRate())/1200;
				j++;
				System.out.print(" month "+j+"\t");
				j--;
				System.out.printf("%.2f",balance[i]);
				System.out.println();
			}
			System.out.println();
		}
		
	}
}