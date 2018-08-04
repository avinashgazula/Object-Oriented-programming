
public class PopulationProjection1 {

	public static void main(String[] args) {
		int current=312032486;
		int year=365*24*60*60,time=1,yearno=0 ;
		System.out.println("Year   : Population");
		while(time<=5*year)
		{
			if(time%7==0)
				current++;
			if(time%13==0)
				current--;
			if(time%45==0)
				current++;
			if(time%year==0)
			{
				yearno++;
				System.out.println("Year "+yearno+" : "+current);
			}
			time++;	
		}
	}
}
