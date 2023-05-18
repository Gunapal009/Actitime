package programmingprogramming;

public class sumofuniqeinarray
{
public static void main(String[] args)
{
Object obj[]= {"abc",25,3,10.5,15,2,'a'};
int x[]=new int[obj.length];
int y=0;
for(int i=0; i<obj.length; i++)
{
	if(obj[i] instanceof Integer)
	{
		x[y]=(int)obj[i];
		y++;
	}
}
int sum=0;
for(int i=0; i<x.length; i++)
{
	int c=0;
	for(int j=0; j<x.length; j++)
	{
		if(x[i]==x[j])
		{
			c++;
		}
	}
	if(c==1)
	{
		sum=sum+x[i];
	}
}
System.out.println("sum"+" "+sum);
}
}
