
import java.util.Scanner;

class Triangle{
	Boolean checkTriangle(double a,double b,double c )
	{
		if(c<a+b&&b<a+c&&a<b+c)
			return true;
		return false;
	}
	double perimeter(double a,double b,double c){
		return a+b+c;
	}
}
public class PerimeterOfTriangle13 {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		double edge1 = 0,edge2 = 0,edge3 = 0;
		do {
			System.out.println("Enter the edges");
			edge1=read.nextDouble();edge2=read.nextDouble();edge3=read.nextDouble();
			if((new Triangle()).checkTriangle(edge1,edge2,edge3))
			{
				System.out.println("Perimeter of the given Triangle is : "+(new Triangle()).perimeter(edge1, edge2, edge3));
			}
			else{
				System.out.println("The given input doesn't form a triangle");
			}
			
		}while(!(new Triangle()).checkTriangle(edge1,edge2,edge3));
		

	}

}
