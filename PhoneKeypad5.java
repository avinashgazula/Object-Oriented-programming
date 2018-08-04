
import java.util.Scanner;

public class PhoneKeypad5 {
	
	public static int getNumber(char uppercaseLetter){
			
		if(uppercaseLetter=='A'||uppercaseLetter=='B'||uppercaseLetter=='C') 
			return 2;
		if(uppercaseLetter=='D'||uppercaseLetter=='E'||uppercaseLetter=='F') 
			return 3;
		if(uppercaseLetter=='G'||uppercaseLetter=='H'||uppercaseLetter=='I') 
			return 4;
		if(uppercaseLetter=='J'||uppercaseLetter=='K'||uppercaseLetter=='L') 
			return 5;
		if(uppercaseLetter=='M'||uppercaseLetter=='N'||uppercaseLetter=='O') 
			return 6;
		if(uppercaseLetter=='P'||uppercaseLetter=='Q'||uppercaseLetter=='R'||uppercaseLetter=='S') 
			return 7;
		if(uppercaseLetter=='T'||uppercaseLetter=='U'||uppercaseLetter=='v') 
			return 8;
		if(uppercaseLetter=='W'||uppercaseLetter=='X'||uppercaseLetter=='Y'||uppercaseLetter=='Z') 
			return 9;
		return 0;
		
	}

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		PhoneKeypad5 obj=new PhoneKeypad5();
		String s;
		System.out.println("Enter the number");
		s=read.next();
		char[] number=s.toCharArray();
		for(int i=0;i<6;i++)
			System.out.print(number[i]);
		for(int i=6;i<number.length;i++)
		{
			int ascii=number[i];
			if(ascii>=97&&ascii<=122)
				number[i]=(char) (ascii-32);
			int no=getNumber(number[i]);
			System.out.print(no);
		}
		
		
	}

}
