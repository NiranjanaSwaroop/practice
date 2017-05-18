import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Pipes {
    
	public static int[] getJoinedPipes(int[] input1)
    {
	
	int[] out = new int[input1.length-1];
	for(int i=0;i<input1.length-1;i++){
	    out[i]=0;
	}
	for(int i=0;i<input1.length;i++)
	{
	    for(int j=0;j<input1.length-i-1;j++)
	    {
	        if(input1[j]>input1[j+1])
	        {
	            int temp=input1[j];
	            input1[j]=input1[j+1];
	            input1[j+1]=temp;
	        }
	    }
	}
	int previous=input1[1],nextPrevious=input1[0];
	for(int i=0,j=2;i<input1.length;i++){
	    
	    
	    out[i]=previous+nextPrevious;
	    previous=out[i];
	    nextPrevious=input1[j++];
	}
	return out;
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int[] output = null;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        int[] ip1 = new int[ip1_size];
        int ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            ip1_item = Integer.parseInt(in.nextLine().trim());
            ip1[ip1_i] = ip1_item;
        }
        output = getJoinedPipes(ip1);
        for(int output_i=0; output_i < output.length; output_i++) {
	        	System.out.println(String.valueOf(output[output_i]));
	            }
    }
}
