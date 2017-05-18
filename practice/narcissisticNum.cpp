#include <iostream>
using namespace std;
#include<math.h>
#include<ctime>
int main()
{
	
	int num=0,digit=0,val=0,sum=0;
	cout<<"Enter a number to check :";
	cin>>num;
	val = num;
	int startTime =clock();
	//cout<<startTime<<endl;
	while(val!=0)
	{
	    digit = val%10;
	    sum = sum + (int)pow(digit,3);
	    val = val/10;
	}
	int stopTime = clock();
	//cout<<stopTime<<endl;
	//cout<<CLOCKS_PER_SEC<<endl;
	if(sum==num){
	    cout<<"Given number is narcissistic."<<endl;
	}
	else{
	    cout<<"Given number is not narcissistic."<<endl;
	}
	cout<<"Execution time is "<<((stopTime-startTime)*1000)/(CLOCKS_PER_SEC)<<" millsecond(s)"<<endl;
	
	return 0;
	
	
}
