#include<ctime>
#include <iostream>
using namespace std;
int main()
{
	
	int size=0,number[10],num=-1,count=0;
	cout<<"Enter size:";
	cin>>size;
	cout<<"Enter elements>>"<<endl;
	for(int i=0;i<size;i++)
	{
	    cin>>number[i];
	}
	cout<<"Enter number:";
	cin>>num;
	int startTime = clock();
	for(int i=0;i<size;i++)
	{
	    if(number[i] > num)
	    {	
	        count++;
	    }
	}
	int stopTime = clock();
	cout<<"There are "<<count<<" numbers greater than "<<num<<endl;
	cout<<"Execution time is "<<(((stopTime-startTime)*1000)/(double)CLOCKS_PER_SEC)<<" ms."<<endl;
	return 0;
}
