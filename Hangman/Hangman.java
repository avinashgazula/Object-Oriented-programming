package Hangman;

import java.util.*;

public class Hangman extends HangmanCode {
	
	private int size; private char[] word;

	public Hangman() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSize(int a){
		this.size=a;
	}
	
	public int getSize(){
		return size;
	}
	
	public void displayWord(){
		System.out.println(word);
	}
	
	public void generateWord(){
		word = new char[size];
		Random rand = new Random();
		for(int i=0;i<size;i++){
			word[i]=(char) (rand.nextInt(26)+97);		
		}
	}

	public char[] getWord(){	
		return this.word;
	}
	
	public boolean alreadyPresent(char[] dup,char ch) {
		
		for(int i=0;i<size;i++){
			if(dup[i]==ch)
				return true;
		}
		return false;
	}
	
	

}
