import java.util.Scanner;
public class MedianOfTwoSortedArrays
{	
		
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums = new int[n1+n2];
        int size = 0;
        double median = 0.0;

        int i=0,j=0,k=0;
    
        while(i<n1 && j<n2){
            nums[k++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
        }
        while(i<n1)
        {
            nums[k++]=nums1[i++];
        }
        while(j<n2)
        {
            nums[k++]=nums2[j++];
        }
        size = nums.length;
        if((size % 2)==0)
        {
            int m = size/2;
            median = ((double)nums[m-1]+(double)nums[m])/(double)2;
             
        }
        else if((size % 2)!=0){
            int m = (size+1)/2;
            median = (double)(nums[m-1]);
            
        }
       return median;
        
    }
	
	public static void main(String[] args)
	{	
		MedianOfTwoSortedArrays med = new MedianOfTwoSortedArrays();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements for first array:");
		int m = scanner.nextInt();
		System.out.println("Enter the elements:");
		int[] nums1 = new int[m];
		for(int i=0;i<m;i++)
		{
			System.out.print("Element "+(i+1)+ " ");
			nums1[i] = scanner.nextInt();
			
		}
		
		System.out.println("Enter the number of elements for second array:");
		int n = scanner.nextInt();
		System.out.println("Enter the elements:");
		int[] nums2 = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+ " ");
			nums2[i] = scanner.nextInt();
			
		}
		long startTime = System.currentTimeMillis();
		double median = med.findMedianSortedArrays(nums1,nums2);
		long stopTime = System.currentTimeMillis();
		System.out.println("The median is "+median+"\n\n");
		System.out.println("For array elements: "+(m+n)+"\nThe Execution time is "+(stopTime-startTime)+" ms.");
	}

}