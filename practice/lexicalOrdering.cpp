#include<ctime>
#include <iostream>
using namespace std;
int main()
{
	
	string str[20];
	int size=0;
	cout<<"Enter the number of strings:"<<endl;
	cin>>size;
	cout<<"Enter Strings:"<<endl;
	for(int i=0;i<size;i++)
	{
	    cin>>str[i];
	}
	int startTime  = clock();
	for(int i=0;i<size-1;i++)
	{
	    for(int j=i+1;j<size;j++)
	    {
	        if(str[i] > str[j])
	        {
	           string carrier = str[i];
	           str[i] = str[j];
	           str[j] = carrier;
	        }
	    }
	}
	int stopTime = clock();
	cout<<"Ordered strings are:"<<endl;
	for(int i=0;i<size;i++)
	{
	    cout<<str[i]<<endl;
	}
	cout<<"Execution time is "<<(((stopTime-startTime)*1000)/(double)CLOCKS_PER_SEC)<<" ms."<<endl;
	return 0;
	
}
