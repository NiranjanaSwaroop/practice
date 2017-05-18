/*Enter your code here. Read input from STDIN. Print your output to STDOUT*/
#include <iostream>
#include<stdlib.h>
using namespace std;
int main()
{
	//Write code here
	int size=0,num[10],sum=0;
	cin>>size;
	for(int i=0;i<size;i++)
	    cin>>num[i];
	    
	cin>>sum;
	for(int i=0;i<size;i++){
	    for(int j=i+1;j<size;j++)
	    {
	        if((num[i]+num[j])==sum){
	            cout<<"True"<<endl;
	            exit(0);
	        }
	    }
	}
	cout<<"False"<<endl;
	return 0;
}
