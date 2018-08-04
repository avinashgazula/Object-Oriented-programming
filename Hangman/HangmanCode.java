package Hangman;

public abstract class HangmanCode {

	public HangmanCode() {
		// TODO Auto-generated constructor stub
	}
	abstract void setSize(int a);
	abstract int getSize();
	abstract void displayWord();
	abstract void generateWord();
	abstract char[] getWord();
	abstract boolean alreadyPresent(char[] dup,char ch);

}
