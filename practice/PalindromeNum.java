import java.util.Scanner;
public class PalindromeNum
{
	public boolean isPalindrome(int x)
	{
		int rev = 0;
		int num = x;
		if((x<0)||(x>0 && x%10==0)) return false;
		while(x!=0)
		{
			rev = (rev*10)+(x%10);
			x=x/10;
		}
		return (num==rev);
	}
	public static void main(String[] args)
	{
		PalindromeNum Num = new PalindromeNum();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer to check:");
		int num = scanner.nextInt();
		long startTime = System.currentTimeMillis();
		boolean value = Num.isPalindrome(num);
		long stopTime = System.currentTimeMillis();
		
		
		if(value)
		{
			System.out.println("Number is palindrome.");
			
		}
		else{
			System.out.println("Number is not palindrome.");
		}
		System.out.println("Execution time is:"+(stopTime-startTime)+" ms.");
		
	}
}