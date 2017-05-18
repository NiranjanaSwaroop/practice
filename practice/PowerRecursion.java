import java.util.*;
public class PowerRecursion{
static int power(int base,int exponent){
    if(exponent==0){
        return 1;
    }
    else{
        return (base*power(base,--exponent));
    }
}
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	int base=0,exponent=0;
	System.out.println("Enter base:");
	base = scanner.nextInt();
	System.out.println("Enter exponent:");
	exponent = scanner.nextInt();
	double startTime = (double)System.currentTimeMillis();
	int Power = power(base,exponent);
	double stopTime = (double)System.currentTimeMillis();
	System.out.println(base+" to the power "+exponent+" is "+Power+".");
	System.out.println("Execution time is "+(stopTime-startTime)+" ms.");
	
}
}