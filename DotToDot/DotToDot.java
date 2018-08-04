package DotToDot;
import java.util.Scanner;
import java.util.Random;

public class DotToDot {

	char[][] grid;
	int size;
	
	public void setSize(int size){
		this.size=size;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public DotToDot() {
		// TODO Auto-generated constructor stub
		grid = new char [size][];
		for(int i=0;i<size;i++){
			grid[i]=new char[size];
		}
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++)
				grid[i][j]=' ';
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
