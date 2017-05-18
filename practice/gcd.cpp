
#include<iostream>
using namespace std;
#include<ctime>
int gcd(int a,int b)
{
	if(a<b)
	{
		int carrier = a;
		a = b;
		b = carrier;
	}
	if(b == 0)
	{
		return a;
	}else{
		return gcd(b,a%b);
	}
}
int main()
{
	int a=0,b=0,GCD=0;
	cout<<"Enter the value of A:";
	cin>>a;
	cout<<"Enter the value of B:";
	cin>>b;
	int startTime = clock();
	GCD = gcd(a,b);
	int stopTime = clock();
	cout<<"Gcd of "<<a<<" and "<<b<<" is "<<GCD<<" ."<<endl;
	cout<<"EXECUTION Time is "<<(((stopTime-startTime)*1000)/(double)CLOCKS_PER_SEC)<<" ms."<<endl;
	return 0;

}