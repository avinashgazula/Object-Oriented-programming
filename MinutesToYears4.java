
import java.util.Scanner;
public class MinutesToYears4 {
		int years(int min){
			return min/(365*24*60);
		}
		int days(int min)
		{
			int d=min/(24*60);
			int y=(new MinutesToYears4()).years(min);
			return ((int) (d)-y*365);
		}
	
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		MinutesToYears4 obj= new MinutesToYears4();
		int minutes;
		System.out.print("Enter the no. of minutes : " );
		minutes=read.nextInt();
		System.out.print(minutes+" minutes is approximately " );
		System.out.print(obj.years(minutes)+" years ");
		System.out.print(obj.days(minutes)+" days ");
		
	}

}
