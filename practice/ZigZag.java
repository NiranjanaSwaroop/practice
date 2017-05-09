import java.util.Scanner;
public class ZigZag
{
	public String converter(String s, int numRows)
	{
		char[] sCharArray = s.toCharArray();
		StringBuffer[] strBuff = new StringBuffer[numRows];
		for(int i=0;i<numRows;i++)
		{
			strBuff[i] = new StringBuffer();
		}
		int j = 0;
		while(j<s.length()){
			for(int i=0;i<numRows && j<s.length();i++)
				strBuff[i].append(sCharArray[j++]);
			for(int i=numRows-2;i>0 && j<s.length();i--)
				strBuff[i].append(sCharArray[j++]);
			
		}
		String str = new String();
		for(int i=0;i<numRows;i++)
			str+=strBuff[i].toString();
		return str;
	}
	public static void main(String[] args)
	{
		ZigZag zigZag = new ZigZag();
		System.out.print("Enter a string for ZigZag conversion:");
		String str = System.console().readLine();
		System.out.print("Enter the number of rows:");
		Scanner scanner = new Scanner(System.in);
		int numRows = scanner.nextInt();
		long startTime = System.currentTimeMillis();
		String zigZagStr = zigZag.converter(str,numRows);
		long stopTime = System.currentTimeMillis();
		System.out.println("The converted string is "+zigZagStr+".");
		System.out.println("For given string of length "+str.length()+"\nThe execution time is "+(stopTime-startTime)+" ms.");
	}
}