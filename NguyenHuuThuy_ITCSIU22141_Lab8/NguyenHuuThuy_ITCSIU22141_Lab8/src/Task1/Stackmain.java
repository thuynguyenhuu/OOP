package Task1;

import java.io.*;

public class Stackmain
{
	
	public static void main(String[] args) throws IOException
	{
		Stack<Character> s = new Stack<>(10); 
		char ch;
	    
	    System.out.println("Please enter 10 characters:"); 
	    
	    while ((ch = (char)System.in.read())!= '\n')
	    {
	    	if (!s.full()) s.push(ch); 	
	    }
	    
	    while (!s.empty()) 
	    {
	    	System.out.print(s.pop()); 
	    }
	    
	    System.out.println(); 
	    
	}
	
}