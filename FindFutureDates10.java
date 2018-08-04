
import java.util.Scanner;
public class FindFutureDates10 {
	
	public static void dayOfWeek(int day){
		switch(day){
		case 0:System.out.print("Sunday");break;
		case 1:System.out.print("Monday");break;
		case 2:System.out.print("Tuesday");break;
		case 3:System.out.print("Wednesday");break;
		case 4:System.out.print("Thursday");break;
		case 5:System.out.print("Friday");break;
		case 6:System.out.print("Saturday");
		}
	}

	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		int today=0,future=0;
		System.out.print("Enter today's day : ");
		today=read.nextInt();
		System.out.print("Enter the no. of days elapsed since today : ");
		future=read.nextInt();
		System.out.print("Today is ");
		dayOfWeek(today);
		System.out.print(" and the future day is ");
		dayOfWeek((today+future)%7);
	}
}
