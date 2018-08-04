package Threadingconnect4;

import java.util.*;

public class game extends Thread{
	

	public game() {
		// TODO Auto-generated constructor stub
	}
	char ch[][];
	int row,col;
	int play;
	boolean over;
	int count;
	int column;
	void setColumn(int c){
		this.column=c;
	}
	void set(int r,int c){
		play=0;
		this.row=r;
		this.col=c;
		ch=new char[r][];
		for(int i=0;i<r;i++){
			ch[i]=new char[c];
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				ch[i][j]=' ';
			}
		}
		over=false;
	}
	void print(){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("|"+ch[i][j]);
			}
			System.out.print("|\n");
		}
	}
	
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
		//	System.out.println("IS is false");
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
	public void run(){
		
		Scanner in = new Scanner(System.in);
		int c = 0;
		while(!over){
			
			System.out.println("player "+0+"'s turn");
			System.out.println("enter a column from 1-7");
				play=0;
				if(in.hasNextInt())
				c=in.nextInt();
				else c=1+(new Random()).nextInt(7);
					setColumn(c);
					{
						column--;
						int i=row-1;
						while(ch[i][column]!=' ')
							i--;
						
							ch[i][column]='R';
						if(!over)
						checkrow(i,column);
						if(!over)
						checkcol(i,column);
						if(!over)
						checkdiag(i,column);
						
						if(!over){
							play=(play+1)%2;
						}
						else
						{
							System.out.println("player R has won the game");
						}
					}
				
					print();
		}
		in.close();
	}
}
