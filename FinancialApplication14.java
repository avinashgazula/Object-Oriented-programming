import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class FinancialApplication14
{
	public static void main(String[] args)
	{
		double loanamount,yrs,rate;
		Scanner in=new Scanner(System.in);
		System.out.println("enter loanamount years and rate in order ");
		loanamount=in.nextDouble();
		yrs=in.nextDouble();
		rate=in.nextDouble();
		double mrate=rate/12;
		mrate/=100;
		double monthly=loanamount*mrate/(1-1/Math.pow(1+mrate,yrs*12));
		double total=monthly*12;
		System.out.println("Monthly payment is : "+monthly);
		System.out.println("total payment is : "+total);
		System.out.println("\n payment     interest    principal    balance");
		int s=1;
		double interest=0,principal,balance=loanamount;
		for(int i=1;i<=12*yrs;i++)
		{
			interest=(balance*rate*0.01)/12;
			principal=monthly-interest;
			balance=balance-principal;
			System.out.print(i+"            ");
			System.out.printf("%.2f",interest);
			System.out.print("      ");
			System.out.printf("%.2f",principal);
			System.out.print("     ");
			System.out.printf("%.2f",balance);
			System.out.println(" ");
		}
	}
}