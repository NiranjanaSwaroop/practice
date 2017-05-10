
public class MyAtoi {
    public int myAtoi(String str) {
        int index = 0;
        int sign = 1;
        int result = 0;
        
        
        if(str.length()== 0) return 0;
        
        
        while(index<str.length() && str.charAt(index) == ' ')
        {
            index++;
        }
        
        
        if(str.charAt(index)=='+' || str.charAt(index)=='-'  )
            {
                sign = (str.charAt(index) == '+') ? 1 : -1 ;
                index++;

            }


        while(index<str.length() && str.charAt(index) == '0')
        {
            index++;
            
        }
        for(int i = index;i<str.length();i++)
        {   
           
            int digit = (int)(str.charAt(i) - '0');
    
            
            if((digit < 0) || (digit > 9)){
                break;
            }
            if(Integer.MAX_VALUE/10 < result || result == Integer.MAX_VALUE/10 && Integer.MAX_VALUE%10 <digit )
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = (result*10)+digit;

                
            
        
        }
        
        return result*sign;
        
    }
	public static void main(String[] args)
	{
		System.out.println("Enter the string of numbers:");
		String numbersStr = System.console().readLine();
		MyAtoi myAtoiObj = new MyAtoi();
		long startTime = System.currentTimeMillis();
		int numbersInt = myAtoiObj.myAtoi(numbersStr);
		long stopTime = System.currentTimeMillis();
		System.out.println("The entered string "+numbersStr+"\nThe converted corresponding integer is "+numbersInt);
		System.out.println("The execution time is "+(stopTime-startTime)+" ms.");
	}
}