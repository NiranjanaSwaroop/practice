#include<ctime>
#include <iostream>
using namespace std;
int main()
{
	
	int size=0,num[10],sum,count=0;
	cout<<"Enter the size:";
	cin>>size;
	cout<<"Enter elements:"<<endl;
	for(int i=0;i<size;i++)
	{
	    cin>>num[i];
	}
	cout<<"Enter the sum:";
	cin>>sum;
	int startTime = clock();
	for(int i=0;i<size;i++)
	{
	    for(int j=i+1;j<size;j++)
	    {
	        if((num[i]+num[j]) == sum )
	        {
	            count++;
	        }
	    }
	}
	int stopTime  = clock();
	cout<<"The number of pairs which make sum "<<sum<<" is "<<count<<endl;
	cout<<"The execution time is "<<(((stopTime-startTime)*1000)/(double)CLOCKS_PER_SEC)<<" ms."<<endl;
	return 0;
}
