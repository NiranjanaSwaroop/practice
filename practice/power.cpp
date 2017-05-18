#include<ctime>
#include <iostream>
using namespace std;
int power(int base,int exponent){
    if(exponent==0){
        return 1;
    }
    else{
        return (base*power(base,--exponent));
    }
}
int main()
{
	
	int base=0,exponent=0;
	cout<<"Enter base:";
	cin>>base;
	cout<<"Enter the exponent:";
	cin>>exponent;
	int startTime = clock();
	int Power = power(base,exponent);
	int stopTime = clock();
	cout<<base<<" to the power "<<exponent<<" is "<<Power<<"."<<endl;
	cout<<"Execution time is "<<(((stopTime-startTime)*1000)/(double)CLOCKS_PER_SEC)<<" ms."<<endl;
	return 0;
}
