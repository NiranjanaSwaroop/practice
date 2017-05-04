import java.util.*;
import java.util.Scanner;
public class TwoSum
{
	int[] numbers = new int[5];
	int target = 0;
	int[] res = {-1,-1};
	Scanner scanner = new Scanner(System.in);
	/*
	public int[] twoSum(int[] numbers,int target)
	{
		int[] result = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<numbers.length;i++)
		{
			if(map.containsKey(target - numbers[i]))
			{
				result[1] = i+1;
				result[0] = map.get(target-numbers[i]);
				return result;
			}
			map.put(numbers[i],i+1);
		}
		return result;
	}
	*/
	public int[] twoSum(int[] numbers,int target)
	{
		int[] result = {-1,-1};
		int sum = 0;
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				sum = numbers[i]+numbers[j];
				if(sum == target)
				{
					result[0] = i;
					result[1] = j;
					break;
				}
			}
			
		}
		return result;
	}
	public static void main(String[] args)
	{
		TwoSum two_Sum = new TwoSum();
		for(int i=0;i<5;i++){
		System.out.print("Enter number "+(i+1)+":");
		two_Sum.numbers[i] = two_Sum.scanner.nextInt();
		}
		System.out.print("Enter Target:");
		two_Sum.target = two_Sum.scanner.nextInt();
		
		
		two_Sum.res = two_Sum.twoSum(two_Sum.numbers,two_Sum.target);
		if(two_Sum.res[0]!=two_Sum.res[1]){
		for(int i=0;i<2;i++)
			System.out.println("Index="+two_Sum.res[i]);
		}
		else
		{
			System.out.println("Error!!");
		}
		
		
	}
}