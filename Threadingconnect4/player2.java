package Threadingconnect4;

import java.util.Random;

public class player2 extends Thread {
	
	game g;

	public player2(game g) {
		// TODO Auto-generated constructor stub
		this.g=g;
		
	}
	
public void run(){
		
		Random r = new Random();
		while(!g.over){
			g.play=1;
			//System.out.println("player "+g.play+"'s turn");
			//System.out.println("enter a column from 1-7");
				
					g.setColumn(1+r.nextInt(7));
					{
						g.column--;
						int i=g.row-1;
						while(g.ch[i][g.column]!=' ')
							i--;
							g.ch[i][g.column]='G';
						if(!g.over)
						g.checkrow(i,g.column);
						if(!g.over)
						g.checkcol(i,g.column);
						if(!g.over)
						g.checkdiag(i,g.column);
						
						if(!g.over){
							g.play=(g.play+1)%2;
						}
						else
						{
							System.out.println("player G has won the game");
						}
					}
				
			//	g.print();
		}
		
	}

}
