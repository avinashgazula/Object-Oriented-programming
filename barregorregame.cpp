#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int barre(int *r,int *n)
{
	int count=0;
	for(int i=0;i<3;i++)
	{
		if(r[i]==n[i])
		count++;
	}
	return count;
}
int gorre(int *r,int *n)
{
	int count=0;
	for(int i=0;i<3;i++)
	{
		if(n[i]!=r[i])
		{
			for(int j=0;j<3;j++)
			{
				if(j!=i)
				{
					if(n[i]==r[j])
					count++;
				}
			}
		}
	}
	return count;
}
int main()
{
	srand(time(0));
	int r[3],n[3],count=0;
	for(int i=0;i<3;i++)
	{
		r[i]=1+(rand()%9);
		do
		{
			if(count!=0)
			{
				r[i]=1+(rand()%9);
			}
			for(int j=0;j<i;j++)
			{
				if(r[j]==r[i])
				count++;
			}	
		}while(count!=0);
	}
//	cout<<r[0]<<" "<<r[1]<<" "<<r[2]<<"\n";
	int m=100,no=0;
	while(1)
	{
		m=m-no;
		no=5;
		if(m==0)
		{
			cout<<"BOOOO\n";
			break;
		}
		cout<<"Enter your numbers\n";
		for(int i=0;i<3;i++)
		cin>>n[i];
		cout<<barre(r,n)<<" barre \n";
		cout<<gorre(r,n)<<" gorre \n";
		
		if(barre(r,n)==3)
		{
			cout<<"You win!!\nYour score is "<<m;
			break;
		}
		else
		{
			cout<<"ERR!!Try Again\n";
		}
	}
}
