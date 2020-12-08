package database;

public class movie{
	private String title;
	private String actor1;
	private String actor2;
	private String director;
	private String year;
	private String runtime;
	
	public movie(String title, String actor1, String actor2, String director, String year, String runtime){
		this.title=title;
		this.actor1=actor1;
		this.actor2=actor2;
		this.director=director;
		this.year=year;
		this.runtime=runtime;		
	}
	
	public String printMovie(){
		String a="Your movie is "+this.title+". Starring "+this.actor1+" and "+this.actor2+". It was directed by "+this.director+". It came out in "+this.year+" and had a runtime of "+this.runtime;
		return a;
	}
	
	public static void main(String[] args){
		movie fin=new movie("fin","fin","fin","fin","2006","5");
		System.out.println(fin.printMovie());
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getActor1(){
		return this.actor1;
	}
	
	public String getActor2(){
		return this.actor2;
	}
	
	public String getDirector(){
		return this.director;
	}
	
	public String getYear(){
		return this.year;
	}
	
	public String getRuntime(){
		return this.runtime;
	}
	
	
}