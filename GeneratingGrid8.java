
import java.util.Scanner;
import java.util.Random;
public class GeneratingGrid8 {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		Random r=new Random();
		int choice = 0,gridSize=3,flag=0;
		
		while(true)
		{
			System.out.println("Select the choice (1.Enter the grid size  2.Generate the Grid  3.Exit");
			choice=read.nextInt();
			if(choice==3)
				break;
			else if(choice==1||choice==2)
			{
				if(choice==1)
				{
					System.out.println("Enter the Gridsize");
					gridSize=read.nextInt();
				}
				int[] a=new int[gridSize*gridSize];
				for(int i=0;i<gridSize*gridSize;i++)
				{
					a[i]=1+r.nextInt(gridSize*gridSize);
					for(int j=0;j<i-1;j++)
					{
						if(a[i]==a[j])
							flag++;
					}
					while(flag!=0)
					{
						a[i]=1+r.nextInt(gridSize*gridSize);
						flag=0;
						for(int j=0;j<=i-1;j++)
						{
							if(a[i]==a[j])
								flag++;
						}
					}
					flag=0;
				}
				for(int j=0;j<gridSize;j++)
				{
					
					for(int i=0;i<gridSize;i++)
					{
						System.out.print("\t"+a[gridSize*j+i]);
						
					}
					System.out.println("");
				}
			
			}
		}
	}

}
