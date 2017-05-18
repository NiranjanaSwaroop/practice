
#include <iostream>
using namespace std;
int main()
{
	
	int size,arr[10],count=0,countA=0,val=-1;
	cout<<"Enter the size of Array:";
	cin>>size;
	cout<<"Enter the array elements:"<<endl;
	for(int i=0;i<size;i++)
	{
	    cin>>arr[i];
	}
	for(int i=0;i<size;i++)
	{	
		countA=0;
	    for(int j=0;j<size;j++)
	    {	
			
	        if(arr[i] == arr[j])
	        {
	           countA++; 
	           
	        }
	    }
	    if(countA > count)
	    {
	        count=countA;
	        val=arr[i];
	    }
	}
	if(count>(size/2))
	{
	    cout<<"Majority number is "<<val<<endl;
	    return 0;
	    
	}
	else{
		cout<<"No majority number"<<endl;
		return -1;
	}
	    
}
