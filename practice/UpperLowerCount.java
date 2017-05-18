
import java.io.*;
public class UpperLowerCount {
    public static void main(String args[] )  {

    	
    	int a=(int)'a';
    	int z=(int)'z';
    	int A=(int)'A';
    	int Z=(int)'Z';
    	int lowerCount = 0,upperCount = 0;
    	String str = System.console().readLine();
    	for(int i=0;i<str.length();i++)
    	{
    	    char ch = str.charAt(i);
    	    int chVal = (int)ch;
    	    if((chVal>= a)&&(chVal<=z))
    	    {
    	        lowerCount++;
    	    }
    	    
    	    if((chVal>=A)&&(chVal<=Z))
    	    {
    	        upperCount++;
    	    }
    	    
    	    
    	}
		System.out.println(upperCount);
    	System.out.println(lowerCount);

   }
}
