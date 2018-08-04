
public class Test {

	public static void main(String[] args) {
		String s1="LosAngeles";
		String s2="Chicago";
		int x=s1.compareTo(s2);
		if(x<0)
		{
			System.out.println(s1);
			System.out.println(s2);
		}
		else
		{
			System.out.println(s2);
			System.out.println(s1);
		}

	}

}
