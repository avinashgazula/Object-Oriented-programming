package Hangman;

import java.util.Scanner;

class failedattempts extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str1;
	failedattempts(String str2){
		this.str1=str2;
	}
	@Override
	public String toString(){
		return("You have 3 failed attempts. The word is "+str1);
	}
}

public class HangmanPlay extends Hangman{
	
	int a, chance = 0, count = 0,temp =0, miss = 0;
	char ch;
	char[] dup;

	public HangmanPlay() {
		// TODO Auto-generated constructor stub
	}
	
	public void gameplay() throws failedattempts{
		Hangman h= new Hangman();
		System.out.println("Enter the size of the word");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		h.setSize(a);
		h.generateWord();
		dup = new char[h.getSize()];
		for(int i = 0; i<h.getSize(); i++){
			dup[i]='*';
		}
		while(count<h.getSize()){
			String s=new String(dup);
			System.out.println("(Guess) Enter a letter in the word "+s);
			ch=(scan.next()).charAt(0);
		if(h.alreadyPresent(dup,ch))	
			System.out.println(ch+" is already in the word");
		else{
			char[] t= new char[h.getSize()];
			t=h.getWord();
			temp=count;
			for(int i=0;i<h.getSize();i++){
				if(t[i]==ch){
					dup[i]=ch;
					count++;	
				}
					
			}
			if(temp == count){
				chance++;
				String s2 = new String(h.getWord());
				if(chance==3&&count==0)
					throw new failedattempts(s2);
				System.out.println(ch+" is not present in the word.");
				if(!h.alreadyPresent(dup,ch))
					miss++;
			}
			
		}
			
		}
		scan.close();
		String s=new String(dup);
		System.out.println("The word is "+s+". You missed "+miss+" time(s)");
		scan.close();
	}
	

	public static void main(String[] args) throws failedattempts {
		
		char ch= 'y';
		Scanner scan = new Scanner(System.in);
		do{
			try{
				(new HangmanPlay()).gameplay();
			}
			catch(failedattempts e){
				System.out.println("You have 3 failed attempts. The word is "+e.str1);
			}
			finally{
				System.out.println("Do you want to play again?");
				ch=(scan.next()).charAt(0);
			}
			
			
		}while(ch=='y');
		scan.close();
		
		}
	}
		// TODO Auto-generated method stub
		
		


