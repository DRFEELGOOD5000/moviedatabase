package database;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import database.movie;
import database.search;
import database.edit;
import database.keyboard;

public class menu{
	
	public static String state="MAIN";
	private static String file="src/db.txt";
	
	public static void main(String[] args) throws IOException{
		p("-----------------------------");
		p("-----------------------------");
		p("--------APOLLO MOVIES--------");
		p("-----------------------------");
		p("------------------------------");
		keyboard key=new keyboard();
		p("Press enter to start");
		key.keyBoard().nextLine();
		key.keyBoard();
		int input=0;
		do{
			input=FSM(key.keyBoard());
			FSM_helper(input, key.keyBoard());
		}
		while(state!="END");
		p("Program Closed");
	
	}
	
	public static void p(String a){
		System.out.println(a);
	}
	
	public static int FSM(Scanner in) throws IOException{
		int x=0;
		switch(state){
			case "MAIN":
				p("Welcome");
				p("----------------------");
				p("(1) Search");
				p("(2) Edit");
				p("(3) End");
				p("----------------------");
				p("Please enter a number:");
				try {
			        x=in.nextInt();
			    } catch (InputMismatchException e) {
			        System.out.println("Invalid entry");
			    }
				in.nextLine();
				break;
		
			case "Search":
				p("Search:");
				p("----------------------");
				p("(1) By actor");
				p("(2) By title");
				p("(3) By director");
				p("(4) By year");
				p("(5) By runtime");
				p("(6) Return");
				p("----------------------");
				p("Please enter a number:");
				try {
			        x=in.nextInt();
			    } catch (InputMismatchException e) {
			        System.out.println("Invalid entry");
			    }
				in.nextLine();
				break;
				
			case "Edit":
				p("Edit:");
				p("----------------------");
				p("(1) New entry");
				p("(2) Return");
				p("----------------------");
				p("Please enter a number:");
				try {
			        x=in.nextInt();
			    } catch (InputMismatchException e) {
			        System.out.println("Invalid entry");
			    }
				in.nextLine();
				break;
				
			case "Search By Actor":
				p("Search Actor:");
				p("Enter a name:");
				p("----------------------");
				break;
				
			case "Search By Title":
				p("Search title:");
				p("Enter a title:");
				p("----------------------");
				break;
				
			case "Search By Director":
				p("Search director:");
				p("Enter a director:");
				p("----------------------");
				break;
				
			case "Search By Year":
				p("Search year:");
				p("Enter a year:");
				p("----------------------");
				break;
				
			case "Search By Runtime":
				p("Search runtime:");
				p("Enter a runtime:");
				p("----------------------");
				break;
				
			case "Add":
				p("What is the title of the new movie?");
				String t=in.nextLine();
				p("Who is the lead actor of the movie?");
				String a1=in.nextLine();
				p("Who is the supporting actor of the movie?");
				String a2=in.nextLine();
				p("Who directed the movie?");
				String d=in.nextLine();
				p("What year was it made?");
				String y=in.nextLine();
				p("What's the runtime of the movie?");
				String r=in.nextLine();
				movie m=new movie(t,a1,a2,d,y,r);
				edit.newEntry(file,m);
				
			
			default:
				x=-1;
			
		}
		return x;
		
	}
	
	public static void FSM_helper(int in, Scanner inn) throws IOException{
		switch(state){
			case "MAIN":
				switch(in){
					case -1:
						state="MAIN";
						break;
					case 1:
						state="Search";
						p("Loading search..");
						break;
					case 2:
						state="Edit";
						p("Loading editor...");
						break;
					case 3:
						state="END";
						
				}
				return;
	
			case "Search":
				switch(in){
					case 1:
						state="Search By Actor";
						p("Loading search by actor...");
						break;
					case 2:
						state="Search By Title";
						p("Loading search by title...");
						break;
					case 3:
						state="Search By Director";
						p("Loading search by director...");
						break;
					case 4:
						state="Search By Year";
						p("Loading search by year...");
						break;
					case 5:
						state="Search By Runtime";
						p("Loading search by runtime...");
						break;
					case 6:
						state="MAIN";
						p("Returning to the main menu...");
						break;
				}
				return;
				
			case "Edit":
				switch(in){
					case 1:
						state="Add";
						p("Loading add movie menu...");
						break;
					case 2:
						state="MAIN";
						p("Returning to the main menu...");
						break;
				}
				return;
				
			case "Search By Actor":
				try{
					search.searchActor(file,inn.nextLine());
				}catch (NoSuchElementException e) {
			        System.out.println("Invalid entry");
			    }
				state="Search";
				p("Press enter to continue.");
				inn.nextLine();		
				return;
				
			case "Search By Title":
				try{
					search.searchTitle(file,inn.nextLine());
				}catch (NoSuchElementException e) {
			        System.out.println("Invalid entry");
			    }
				state="Search";
				p("Press enter to continue.");
				inn.nextLine();		
				return;
				
			case "Search By Director":
				try{
					search.searchDirector(file,inn.nextLine());
				}catch (NoSuchElementException e) {
			        System.out.println("Invalid entry");
			    }
				state="Search";
				p("Press enter to continue.");
				inn.nextLine();		
				return;
				
			case "Search By Year":
				try{
					search.searchYear(file,inn.nextLine());
				}catch (NoSuchElementException e) {
			        System.out.println("Invalid entry");
			    }
				state="Search";
				p("Press enter to continue.");
				inn.nextLine();		
				return;
				
			case "Search By Runtime":
				try{
					search.searchRuntime(file,inn.nextLine());
				}catch (NoSuchElementException e) {
			        System.out.println("Invalid entry");
			    }
				state="Search";
				p("Press enter to continue.");
				inn.nextLine();		
				return;
				
			case "Add":
				switch(in){
					case -1:
						state="Edit";
						p("Movie added. Returning to edit...");
						p("Press enter to continue.");
						inn.nextLine();
				}
				return;
				
			case "Delete":
				
				
			}	
		}
}