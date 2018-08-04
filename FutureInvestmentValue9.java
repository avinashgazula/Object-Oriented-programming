
import java.util.Scanner;


public class FutureInvestmentValue9 {
   
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		double investmentAmount;double noOfYears=0;double annualInterest=0;
		System.out.println("Enter Investment amount : ");
		investmentAmount=read.nextDouble();
		System.out.println("Enter Annual Interest : ");
		annualInterest=read.nextDouble();
		System.out.println("Enter No. of Years : ");
		noOfYears=read.nextDouble();
		annualInterest=annualInterest/100;
		double interest=annualInterest*investmentAmount*noOfYears;
		double finalvalue=investmentAmount+interest;
		System.out.println("future Investment amount : "+finalvalue);
	}    
}
