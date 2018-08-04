package connect5;

public class connect5 {
	char ch[][];
	int row,col;
	int play;
	boolean over;
	int count;
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
}
