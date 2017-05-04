public class LongestPalindrome
{

    public String longestPalindrome(String s) {
        String str = s;
        int n = s.length();
        int len = -2;
        int tlen = -1;
        String testStr = "";
        String longPalStr = "";
        if(n==1) return s;
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>i;j--){
                testStr = str.substring(i,j);
                boolean pal = isPalindrome(testStr);
                tlen = testStr.length();
                if((pal) && (tlen > len) )
                {
                    len = tlen;
                    longPalStr = testStr;
                }
            }
            
        }
        return longPalStr;
        
    }
    public boolean isPalindrome(String str)
    {
        int n = str.length();
        int i = 0,j = n-1,count = 0;

        while((i<=n-1)&&(j>=0))
        {
            if((str.charAt(i++) == str.charAt(j--))) count++;
        }
        if(count==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    
	}
	public static void main(String[] args)
	{
		LongestPalindrome longestPaliString = new LongestPalindrome();
		System.out.print("Enter a string: ");
		String str = System.console().readLine();
		long startTime = System.currentTimeMillis();
		String revStr = longestPaliString.longestPalindrome(str);
		long stopTime = System.currentTimeMillis();
		System.out.println("Longest Palindrome is "+revStr);
		System.out.println("For string of length "+str.length()+"\n\n"+"The execution time is "+(stopTime-startTime)+" ms.");
		
	}
}