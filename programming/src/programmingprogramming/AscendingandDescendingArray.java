package programmingprogramming;

import java.util.Scanner;

public class AscendingandDescendingArray 
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter array length");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter array elements");
for(int i=0; i<a.length; i++)
{
	a[i]=s.nextInt();
}
System.out.println("enter a index");
int m=s.nextInt();
for(int i=0; i<a.length; i++)
{
	if(i<=m)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]>a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	else
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]<a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
}
System.out.println("new array");
for(int i=0; i<a.length; i++)
{
	System.out.println(a[i]);
}
}
}
