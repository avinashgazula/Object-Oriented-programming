package connect5;

public class game extends connect5{
	void checkrow(int a,int b){
		int i=a;
		int j=b;
		int flag=0;
		
		char m= ch[a][b];
		System.out.println("a: "+a+" b: "+b+" m: "+m);
		boolean is=false;
		while(ch[i][j]==m){
			if(i>0){
				i--;
				flag++;
			}
			else
			{
				is=true;
				break;
			}
		}
		i=a;
		j=b;
		while(ch[i][j]==m){
			if( i<row-1)
			{
				i++;
				flag++;
			}
			else
			{
				is=false;
				break;
			}
		}
		if(flag>5) over=true;
		else if(flag==5 && is) over=true;
	}
	void checkcol(int a,int b){
		int i=a;
		int j=b;
		int flag=0;
		char m=ch[a][b];
		boolean is=false;
		System.out.println("a: "+a+" b: "+b+" m: "+m);
		while(ch[i][j]==m){
			if(j>0)
			{
				j--;
				flag++;
			}
			else
			{
				is=true;
				break;
			}
		}
		i=a;
		j=b;
		while(ch[i][j]==m){
			if(j<col-1)
			{
				j++;
				flag++;
			}
			else
			{
				is=true;
				break;
			}
		}
		if(flag>5) over=true;
		else if(flag==5 && is) over=true;
	}
	void checkright(int a,int b){
		int i=a;
		int j=b;
		int flag=0;
		char m=ch[a][b];
		boolean is=false;
		System.out.println("a: "+a+" b: "+b+" m: "+m);
		while(ch[i][j]==m){
			if(i<row-1 && j<col-1)
			{
				i++;
				j++;
				flag++;
			}
			else
			{
				is=true;
				break;
			}
		}
		i=a;
		j=b;
		while(ch[i][j]==m){
			if(i>0 && j>0){
				i--;
				j--;
				flag++;
			}
			else
			{
				is=true;
				break;
			}
		}
		if(flag>5) over=true;
		else if(flag==5 && is) over=true;
	}
	void checkleft(int a,int b){
		int i=a;
		int j=b;
		int flag=0;
		char m=ch[a][b];
		boolean is=false;
		System.out.println("a: "+a+" b: "+b+" m: "+m);
		while(ch[i][j]==m){
			if(i<row-1 &&j>0)
			{
				i++;
				j--;
				flag++;
			}
			else
			{
				is=true;
				break;
			}
		}
		i=a;
		j=b;
		while(ch[i][j]==m){
			if(i>0 &&j<col-1){
				i--;
				j++;
				flag++;
			}
			else
			{
				is=true;
				break;
			}
		}
		if(flag>5) over=true;
		else if(flag==5 && is) over=true;
	}
	void checkdiag(int a,int b){
		checkright(a,b);
		if(!over)
		checkleft(a,b);
	}
	void insert(int col){
		col--;
		int i=row-1;
		while(ch[i][col]!=' ')
			i--;
		if(play==0)
			ch[i][col]='0';
		else if(play==1)
			ch[i][col]='1';
		else if(play==2)
			ch[i][col]='2';
		else if(play==3)
			ch[i][col]='3';
		print();
		if(!over)
		checkrow(i,col);
		if(!over)
		checkcol(i,col);
		if(!over)
		checkdiag(i,col);
		
		if(!over){
			play=(play+1)%4;
		}
		else
		{
			System.out.println("player "+play+" has won the game");
		}
	}
}
