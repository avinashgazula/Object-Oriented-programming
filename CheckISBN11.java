
import java.util.Scanner;
public class CheckISBN11 {
	
	char lastDigit(int num){
	
		switch(num)
		{
		case 0:return '0';
		case 1:return '1';
		case 2:return '2';
		case 3:return '3';
		case 4:return '4';
		case 5:return '5';
		case 6:return '6';
		case 7:return '7';
		case 8:return '8';
		case 9:return '9';
		case 10:return 'X';
		
		}
		return '\0';
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		String s;
		System.out.print("Enter the first nine digits of the ISBN as an integer : ");
		s=read.next();
		char[] number=s.toCharArray();
		int d = 0;
		for(int i=0;i<=8;i++){
			d+=(i+1)*(number[i]-'0');
		}
		d= d%11;
		System.out.println(d);
		//number[9]=(new CheckISBN11()).lastDigit(d);
		s=new String(number)+(new CheckISBN11()).lastDigit(d);
		System.out.println("The ISBN-10 Number is : "+s);
		}

}
