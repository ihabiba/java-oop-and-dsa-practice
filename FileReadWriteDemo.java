import java.io.*;
public class Lab10
{
   
	public static void main (String[] args)throws IOException
	{
	  //String word = "Testing";
	  //System.out.println(word.substring(0, 3));
	  
	  //writing in file
	  //set up file and stream
	  File outFile = new File("sample.data");
	  FileWriter outFileStream = new FileWriter(outFile);     //(---)should be the same name as the File object variable 
	  PrintWriter outStream = new PrintWriter(outFileStream); //(---)should be the same name as the FileWriter object variable
	  
	  
	  //print inside the file
	  outStream.println("How are you?");    
	  outStream.println("What are you doing now");
	  outStream.println(123456);  
	  
	
	  for(int i=1; i<=10; i++)
	  {
	    outStream.println(i +" " + "all is well");
	  }
	  
	  //close the stream after getting the output
	  outStream.close();
	  
	  
	  //Reading from file
	  //set up file and stream
	  File inFile = new File("sample.data");
	  FileReader reader = new FileReader(inFile);
	  BufferedReader bufReader = new BufferedReader(reader);
	  
	  String str;
	  
	  
	  str = bufReader.readLine();
	  System.out.println(str);
	  

	}


}