import java.util.Scanner;
public class RegEx
{
	static public boolean isMatch(String s,String p)
	{
		if(s == null || p == null) return false;
		boolean[][] dataProcessing = new boolean[s.length()+1][p.length()+1];
		dataProcessing[0][0] = true;
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i) == '*' && dataProcessing[0][i-1])
				dataProcessing[0][i+1] = true;
		}
		for(int i=0;i<s.length();i++)
		{

				for(int j=0;j<p.length();j++)
				{
					if(p.charAt(j) == '.')
						dataProcessing[i+1][j+1] = dataProcessing[i][j];
					if(p.charAt(j) == s.charAt(i))
						dataProcessing[i+1][j+1] = dataProcessing[i][j];
					if( p.charAt(j) == '*' )
					{
						if(p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '.')
						{
							dataProcessing[i+1][j+1] = dataProcessing[i+1][j-1];
						}							
						else
						{
							dataProcessing[i+1][j+1] = (dataProcessing[i+1][j]||dataProcessing[i][j+1]||dataProcessing[i+1][j-1]);
						}
					}
				}
			
		}
		return dataProcessing[s.length()][p.length()];
		
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the string,");
		String string = System.console().readLine();
		System.out.println("Enter the pattern,");
		String pattern = System.console().readLine();
		long startTime = System.currentTimeMillis();
		boolean val = isMatch(string,pattern);
		long stopTime = System.currentTimeMillis();
		if(val)
			System.out.println("Matched");
		else
			System.out.println("Not Matched");
		System.out.println("Execution time is "+(stopTime-startTime)+" ms");
		
		
	}
	
}