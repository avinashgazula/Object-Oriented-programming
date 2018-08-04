import java.util.Scanner;
public class Orderthreecities {

	public static void main(String[] args) {
	
		Scanner obj=new Scanner(System.in);
		String[] s = new String[3]; 
		System.out.println("Enter First city");
		s[0]=obj.nextLine();
		System.out.println("Enter Second city");
		s[1]=obj.nextLine();
		System.out.println("Enter Third city");
		s[2]=obj.nextLine();
		String min=s[0],max=s[0];
		System.out.println("The names of the cities in alphabetical order is");
		for(int i=1;i<3;i++)
		{
			if(s[i].compareToIgnoreCase(min)<0)
				min=s[i];
			else if(s[i].compareToIgnoreCase(max)>0)
				max=s[i];
		}
		System.out.print(" "+min);
		for(int i=0;i<3;i++)
		{
			if(s[i]!=min&&s[i]!=max)
				System.out.print(" "+s[i]+" ");
		}
		System.out.println(max);

	}

}
