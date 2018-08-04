package fifth;
import java.util.Scanner;
public class five {
	public static void main(String[] args) {
		gme obj=new gme();
		Scanner in=new Scanner(System.in);
		obj.set(6,7);
		obj.print();
		while(!obj.over){
			System.out.println("player "+obj.play+"'s turn");
			System.out.println("enter a column from 1-7");
			obj.insert(in.nextInt());
		}
	}
}
