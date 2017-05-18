import java.util.Scanner;
public class MultSum
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first factor:");
		int x = scanner.nextInt();
		System.out.println("Enter second factor:");
		int y = scanner.nextInt();
		
		System.out.println("Enter upperlimit:");
		final int  limit = scanner.nextInt();
		scanner.close();
		new Thread(new Runnable(){
			@Override
			public void run(){
			int sum=0;	
			for(int i=1;i<limit;i++){
				if(i%x==0 || i%y==0) sum=sum+i;
			}
			System.out.println(sum);
			}
			
		}).start();
		
		
	}
}