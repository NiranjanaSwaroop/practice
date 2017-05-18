import java.util.Scanner;
public class MultThreeFive{
	long sumMultThreeFive(int cap){
		long sum = 0;
		for(int i=1;i<cap;i++)
		{
			if((i%3 == 0) || (i%5==0))
			{
				sum = sum + (long)i;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		MultThreeFive multThreeFive = new MultThreeFive();
		System.out.println("Enter cap:");
		int cap = scanner.nextInt();
		long startTime = System.currentTimeMillis();
		long sum = multThreeFive.sumMultThreeFive(cap);
		long stopTime = System.currentTimeMillis();
		System.out.println("Sum is "+sum);
		System.out.println("Execution time:"+(stopTime-startTime));
		
	}
}