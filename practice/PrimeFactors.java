import java.lang.Math;
import java.util.Scanner;
public class PrimeFactors{
	static void primeFactors(long n){
		while(n%2 == 0){
			n=n/2;
			System.out.println("2");
		}
		for(int i=3;i<Math.sqrt(n);i=i+2)
		{
			while(n%i == 0){
				n=n/i;
				System.out.println(i);
			}
		}
		if(n>2) System.out.println(n);
	}
	public static void main(String[] args)
	{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the number:");
			long n = (long)scanner.nextDouble();
			System.out.println("<<<<<PRIME FACTORS>>>>>");
			long startTime = System.currentTimeMillis();
			primeFactors(n);
			long stopTime = System.currentTimeMillis();
			System.out.println("Execution time is "+(stopTime-startTime)+"ms");
	}
}