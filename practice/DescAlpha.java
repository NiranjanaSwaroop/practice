
import java.io.*;
import java.util.*;
public class DescAlpha {
    public static void main(String args[] ) throws Exception {

    	
    	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
    	int n = scanner.nextInt();
    	char ch;
    	ch=(char) ('A'+n-1);
    	StringBuilder sb = new StringBuilder(30);
    	for(int i = 0;i < n;i++){
    	    sb.append(ch);
    	    if(i!=n-1)
    	    sb.append(" ");
    	    ch = (char)(ch - 1);
    	}
    	
    	for(int i = 0;i<n;i++){
    	    System.out.println(sb);
    	}

   }
}
