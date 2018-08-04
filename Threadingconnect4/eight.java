package Threadingconnect4;

import java.util.Scanner;
public class eight extends Thread {

	public static void main(String[] args) {
		game obj1=new game();
		Scanner in=new Scanner(System.in);
		obj1.set(6,7);

		obj1.start();
			
		player2 obj2=new player2(obj1);
		obj2.start();
		try{
			obj2.wait(100);
		}
		catch(Exception e){
		}
		
		in.close();
	}

}
