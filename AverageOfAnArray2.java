

import java.util.Random;
public class AverageOfAnArray2 {

	public static void main(String[] args) {
		Random r=new Random();
		int[] x=new int[10];
		double[] y=new double[10];
		for(int i=0;i<10;i++)
		{
			x[i]=r.nextInt(101);
			y[i]=r.nextInt(51)+r.nextDouble();
			
			System.out.print(x[i]+"\t");
			System.out.printf("%.2f",y[i]);
			System.out.println();
		}
		int avgint=0;double avgdouble=0.0;
		for(int i=0;i<10;i++)
		{
			avgint+=x[i];
			avgdouble+=y[i];
		}
		System.out.println("Avg Integer Value\t"+avgint/10.0);
		System.out.printf("Avg Double Value\t%.2f",avgdouble/10.0);
	}

}
