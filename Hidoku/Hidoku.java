package Hidoku;

public class Hidoku {
	
	int[][] grid; int size=0; 
	
	public void setSize(int a){
		this.size=a;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public void generateGrid(){
		grid = new int [size][];
		for(int i=0;i<size;i++){
			grid[i]=new int[size];
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++)
				grid[i][j]=0;
		}
	}
	
	public void randomGrid(int k){
		int r=-1,c=-1;
		
		for(int i=1;i<=k;i++){
			
		}
		
	}

	public Hidoku() {
		// TODO Auto-generated constructor stub
	}

}
