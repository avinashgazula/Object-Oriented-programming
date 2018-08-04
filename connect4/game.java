package connect4;
public class game extends connect4{
	void checkrow(int a,int b){
		int i=a;
		int j=b;
		int flag=0;
		
		char m=ch[a][b];
		//System.out.println("a: "+a+" b: "+b+" m: "+m);
		boolean is=false;
		while(ch[i][j]==m ){
			if(i>0){
				i--;
				flag++;
			}
			else{
				is=true;
				break;
			}
		}
		i=a;
		j=b;
		while(ch[i][j]==m){
			if(i<row-1){
				i++;
				flag++;
			}
			else
			{
				is=true;
				break;
			}
		}
	//	System.out.println("flag in row : "+flag);
		if(is){
		//	System.out.println("IS is true");
		}
		else
		{
			System.out.println("IS is false");
		}
		if(flag>4) over=true;
		else
			if(flag==4 && is) over=true;
		
	}
	void checkcol(int a,int b){
		int i=a;
		int j=b;
		int flag=0;
		char m=ch[a][b];
	//	System.out.println("a: "+a+" b: "+b+" m: "+m);
		boolean is=false;
		while(ch[i][j]==m){
			if(j>0){
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
			if(j<col-1){
			j++;
			flag++;
			}
			else
			{
				is=true;
				break;
			}
		}
	//	System.out.println("flag in column: "+flag);
		if(is){
	//		System.out.println("IS is true");
		}
		else
		{
	//		System.out.println("IS is false");
		}
		if(flag>4) over=true;
		else
			if(flag==4 && is) over=true;
	}
	void checkright(int a,int b){
		int i=a;
		int j=b;
		int flag=0;
		char m=ch[a][b];
	//	System.out.println("a: "+a+" b: "+b+" m: "+m);
		boolean is=false;
		while(ch[i][j]==m){
			if(i<row-1 && j<col-1){
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
		while(ch[i][j]==m ){
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
	//	System.out.println("flag in right: "+flag);
		if(flag>4) over=true;
		else
			if(flag==4 && is) over=true;
	}
	void checkleft(int a,int b){
		int i=a;
		int j=b;
		int flag=0;
		char m=ch[a][b];
	//	System.out.println("a: "+a+" b: "+b+" m: "+m);
		boolean is=false;
		while(ch[i][j]==m){
			if( i<row-1 &&j>0){
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
			if(i>0 &&j<col-1)
			{
				i--;
				j++;
				flag++;
			}
			else{
				is=true;
				break;
			}
		}
	//	System.out.println("flag in left: "+flag);
		if(flag>4) over=true;
		else
		if(flag==4 && is ) over=true;
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
			ch[i][col]='R';
		else if(play==1)
			ch[i][col]='G';
		print();
		if(!over)
		checkrow(i,col);
		if(!over)
		checkcol(i,col);
		if(!over)
		checkdiag(i,col);
		
		if(!over){
			play=(play+1)%2;
		}
		else
		{
			System.out.println("player "+play+" has won the game");
		}
	}
}