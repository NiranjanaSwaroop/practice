public class DistinctString
{
	String str = new String();
	public int distinctString(String s) {
        StringBuilder str = new StringBuilder(s);
        int n = str.length();
        int actN=0;
        System.out.println("Given string length:"+n);
        for(int i=0;i<s.length();i++){
            char mChar=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                char nChar=s.charAt(j);
                
                if(mChar == nChar){
                    str.setCharAt(j,'\"');
                  
                
                }
                
            }
        
        }
        
        String st=str.toString();
        st=st.replaceAll("\"","");
		System.out.println("Given String: "+s);
		System.out.println("Distinct String: "+st);
        actN=st.length();
        return actN;
        
    }
	public static void main(String[] args)
	{
		DistinctString  distinctStr = new DistinctString();
		System.out.print("Enter string:");
		
		distinctStr.str = System.console().readLine();
		long startTime = System.currentTimeMillis();
		int distinctLength = distinctStr.distinctString(distinctStr.str);
		long stopTime = System.currentTimeMillis();
		System.out.println("Distinct String length: "+distinctLength);
		System.out.println("Execution time: "+(stopTime-startTime)+" ms");
		
	}
}