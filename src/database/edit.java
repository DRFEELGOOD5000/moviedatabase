package database;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import database.movie;

public class edit{
	public static void newEntry(String file, movie in) throws IOException{
		PrintWriter wr = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
        wr.write(in.getTitle()+";"+in.getActor1()+";"+in.getActor2()+";"+in.getDirector()+";"+in.getYear()+";"+in.getRuntime());
        wr.append("\n");
        wr.close();
}
}