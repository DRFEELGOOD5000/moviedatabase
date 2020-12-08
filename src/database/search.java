package database;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import database.movie;

public class search {

	public static ArrayList<movie> parseFile(String file,String in) throws IOException{
    	ArrayList<movie> ret=new ArrayList<movie>();
        Scanner scan = new Scanner(new File(file));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase().toString();
            if(line.contains(in.toLowerCase())){
                StringTokenizer st= new StringTokenizer(line,";");
                String t=st.nextToken();
                String a1=st.nextToken();
                String a2=st.nextToken();
                String d=st.nextToken();
                String y=st.nextToken();
                String r=st.nextToken();
                movie m=new movie(t,a1,a2,d,y,r);
                ret.add(m);
        	}   
        }
        scan.close();   
        return ret;
    }
    
    public static void p(String e){
    	System.out.println(e);
    }
    
    public static void searchTitle(String file, String in) throws IOException{
    	ArrayList<movie> x=parseFile(file,in);
    	if(!x.isEmpty()){
    		for(int i=0; i<x.size();i++){
    			String y=x.get(i).getTitle();
    			String z=x.get(i).printMovie();
    			if(in.toLowerCase().equals(y)){
    				p(z);
    			}
    			else{
    				p("Hmm, looks like you may be searching by the wrong category. Maybe try a different parameter.");
    				break;
    			}
    		}
    	}
    	else
    		p("Movie not found.");
    }
    
    public static void searchActor(String file, String in) throws IOException{
    	ArrayList<movie> x=parseFile(file,in);
    	if(!x.isEmpty()){
    		for(int i=0; i<x.size();i++){
    			String w=x.get(i).getActor2();
    			String y=x.get(i).getActor1();
    			String z=x.get(i).printMovie();
    			if(in.toLowerCase().equals(y) || in.toLowerCase().equals(w)){
    				p(z);
    			}
    			else{
    				p("Hmm, looks like you're searching by the wrong category. Maybe try a different parameter.");
    				break;
    			}
    		}
    	}
    	else
    		p("Movie not found.");
    }
    
    public static void searchDirector(String file, String in) throws IOException{
    	ArrayList<movie> x=parseFile(file,in);
    	if(!x.isEmpty()){
    		for(int i=0; i<x.size();i++){
    			String y=x.get(i).getDirector();
    			String z=x.get(i).printMovie();
    			if(in.toLowerCase().equals(y)){
    				p(z);
    			}
    			else{
    				p("Hmm, looks like you may be searching by the wrong category. Maybe try a different parameter.");
    				break;
    			}
    		}
    	}
    	else
    		p("Movie not found.");
    }
    
    public static void searchYear(String file, String in) throws IOException{
    	ArrayList<movie> x=parseFile(file,in);
    	if(!x.isEmpty()){
    		for(int i=0; i<x.size();i++){
    			String y=x.get(i).getYear();
    			String z=x.get(i).printMovie();
    			if(in.toLowerCase().equals(y)){
    				p(z);
    			}
    			else{
    				p("Hmm, looks like you may be searching by the wrong category. Maybe try a different parameter.");
    				break;
    			}
    		}
    	}
    	else
    		p("Movie not found.");
    }
    
    public static void searchRuntime(String file, String in) throws IOException{
    	ArrayList<movie> x=parseFile(file,in);
    	if(!x.isEmpty()){
    		for(int i=0; i<x.size();i++){
    			String y=x.get(i).getRuntime();
    			String z=x.get(i).printMovie();
    			if(in.toLowerCase().equals(y)){
    				p(z);
    			}
    			else{
    				p("Hmm, looks like you may be searching by the wrong category. Maybe try a different parameter.");
    				break;
    			}
    		}
    	}
    	else
    		p("Movie not found.");
    }

}