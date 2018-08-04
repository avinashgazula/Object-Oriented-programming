
public class minDistanceBetweenPoints3 {
	
	double distance(double a1,double b1,double c1,double a2,double b2,double c2){
		return Math.abs(Math.sqrt(Math.pow(a1-a2, 2)+Math.pow(b1-b2, 2)+Math.pow(c1-c2, 2)));
	}
	

	public static void main(String[] args) {
		double a1=-1,b1=2,c1=2,a2=-1,b2=2,c2=3,minDistance=1000.0;
		double[][] points = {{-1, 2, 3}, {-1, -1, -1}, {5, 2, 1}, {3, 0.5, 9},  {3.5, 2, -1.5}, {8, 1.5, - 3}, {-4, 4, 2}, {7, 4, -0.5}};

		for(int i=0;i<8;i++)
		{
			
			for(int j = i;j<8;j++)
			{
				
				double x=(new minDistanceBetweenPoints3()).distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
				if(x<minDistance&&x!=0){
					minDistance=x;
					a1=points[i][0];b1= points[i][1];c1= points[i][2];a2= points[j][0];b2= points[j][1];c2= points[i][2];
				}
			}
		}
		System.out.println("The closest two points are ("+a1+","+b1+","+c1+") and ("+a2+","+b2+","+c2+"), and the distance is"+minDistance);
		
	}

}
