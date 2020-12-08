package database;

import java.util.Scanner;

public class keyboard{
	
	public Scanner sc=new Scanner(System.in);
	
	public keyboard(){

	}
	
	public void close(){
		this.close();
	}
	
	public Scanner keyBoard(){
		return this.sc;
	}
	
	public void nextLine() {
		this.nextLine();
		
	}

	public static void main(String[] args){
		keyboard key=new keyboard();
		key.keyBoard();
	}
}