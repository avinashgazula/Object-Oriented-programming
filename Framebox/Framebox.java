package Framebox;
import java.util.Scanner;

public class Framebox {
	
	char[][] grid;
	
	public Framebox(){
		grid = new char [10][];
		for(int i=0;i<10;i++){
			grid[i]=new char[10];
		}
		
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++)
				grid[i][j]=' ';
		}
	}
	
	public void setPosition(int i,int j,char color){
		grid[i][j]=color;
	}
	
	public boolean win (int a,int b){
		char curr=grid[a][b];
		int c1=0,c2=0,r=0,c=0,side=0;
		
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(r==0&&grid[i][j]==curr)
					c1=j;
				if(grid[i][j]==curr)
					r++;
				else if(r>1){
					c2=j-1;c=0;
					side=c2-c1+1;
				//	System.out.println(side+" side");
				//	System.out.println("hello");
					for(int k=i+1;k<i+side;k++){
				//		System.out.println(k);
						if(grid[k][c1]==curr&&grid[k][c2]==curr)
							c++;
					}
				//	System.out.println(c+" c");
					if(c==side-1){
						c=0;
						for(int l=c1;l<=c2;l++){
							if(grid[i+side-1][l]==curr)
								c++;
						}
						if(c==side)
							return true;
						else{
							c=0;
							j=j+side-1;
							r=0;
							side=0;	
						}
					}
					r=0;side=0;c=0;
					c1=0;c2=0;
					j=j+side-1;
				}
				else{
					r=0;
					c1=0;
					c2=0;
				}
			}
			r=0;
			c=0;
		}
		
		return false;
		
	}
	
	public void displayGrid(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print("|"+grid[i][j]);
			}
			System.out.println("|");
		}
	}
	
	public char getPlayer(int p){
		if(p==0) return 'R';
		else if(p==1) return 'Y';
		else return ' ';
	}
	
	public static void main(String[] args) {
		int count=0;
		int player=0;
		int row=0,column=0;
		Framebox f =new Framebox();
		Scanner read= new Scanner(System.in);
		
		while(count<100){
			count++;
			
			System.out.println("Enter the row and column for player "+f.getPlayer(player));
			row=read.nextInt();
			column=read.nextInt();
			f.setPosition(row,column,f.getPlayer(player));
			if(f.win(row, column)){
				System.out.println(f.getPlayer(player)+" wins");
				break;
			}
			else if(count==100)
				System.out.println("draw");
			else{
				f.displayGrid();
				System.out.println("continue");
				player=(player+1)%2;
			}
		}
		read.close();
		
		
	}

}
