	import java.util.Scanner;
	import java.lang.Math;
	public class ReverseInteger {
    public int reverseLikeStr(int x) {
        int rev;
        int pass = 1;
        String revStr = new String();
        if(x>=0){
            pass =1;
        }else{
            pass = -1;
        }
        int value =(int)Math.abs(x);
        String str = Integer.toString(value);
        
        int j = str.length()-1;
        while(j>=0)
        {
            revStr += str.charAt(j--);
        }
        rev = Integer.parseInt(revStr);
        return rev*pass;
    }
	    public int reverse(int x) {
        long answer = 0;
        int r = 1;
        int value = x;
        while(value!=0)
        {   
            r=value%10;
            answer = (answer*10)+r;
            value = value / 10;
        }
        
        return (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE)?0:(int)answer;
        
    }
	public void printLineStar(int n)
	{
		for(int i=0;i<n;i++)
			System.out.print("*");
		System.out.println();
	}
	public static void main(String[] args)
	{
		ReverseInteger reverseInteger = new ReverseInteger();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the integer to reverse:");
		int num = scanner.nextInt();
		long startTime = System.currentTimeMillis();
		int revNum = reverseInteger.reverseLikeStr(num);
		long stopTime = System.currentTimeMillis();
		reverseInteger.printLineStar(20);
		System.out.println("In reverseLikeStr:-->");
		System.out.println("Given Integer of length "+String.valueOf(num).length()+"\nIt's reverse is "+revNum);
		System.out.println("The execution time is "+(stopTime-startTime)+" ms.");
		reverseInteger.printLineStar(20);

		
		startTime = System.currentTimeMillis();
		revNum = reverseInteger.reverse(num);
		stopTime = System.currentTimeMillis();
		reverseInteger.printLineStar(20);
		System.out.println("In reverse:-->");
		System.out.println("Given Integer of length "+String.valueOf(num).length()+"\nIt's reverse is "+revNum);
		System.out.println("The execution time is "+(stopTime-startTime)+" ms.");
		reverseInteger.printLineStar(20);
	}
}