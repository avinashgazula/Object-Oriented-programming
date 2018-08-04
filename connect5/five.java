package connect5;
import java.util.Scanner;
public class five {
	public static void main(String[] args) {
		game obj=new game();
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
