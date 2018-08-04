#include<iostream>
#include<cstring>
using namespace std;
class nit{
	char *front;
	char *rear;
	char a[15]="NIT,WARANGAL";
	int l=strlen(a);
	
	int i;
	public:
		void assign()
		{
			front=&a[0];
			rear=&a[l-1];
		}
		void swap(char *a,char *b)
		{
			char temp;
			temp=*a;
			*a=*b;
			*b=temp;
		}
		void reverse(){
			i=0;
			while(i<l/2)
			{
				cout<<a<<endl;
				if(front!=rear)
				swap(front,rear);
				i++;
				front=&a[i];
				rear=&a[l-1-i];
			}
			cout<<a;
		}
};
int main()
{
	nit w;
	w.assign();
	w.reverse();
}
