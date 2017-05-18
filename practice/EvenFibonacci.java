import java.util.Scanner;
public class EvenFibonacci{
	static long sumEvenFibonacci(int n){
		int nextPrevious = 1,previous = 2,current = 0;
		long sum = 0;
		if(n >= 2) sum=2;
		for(int i=3;i<=n;i++){
			current = previous + nextPrevious;
			nextPrevious = previous;
			previous = current;
			if(current % 2 == 0)
			{
				sum = sum + (long)current;
			}
			
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = scanner.nextInt();
		long startTime = System.currentTimeMillis();
		long sum = sumEvenFibonacci(n);
		long stopTime = System.currentTimeMillis();
		System.out.println("Sum is "+sum+".");
		System.out.println("Execution time is "+(stopTime-startTime));
		
	}
}