package programmingprogramming;

import java.util.Scanner;

public class AscendingTwoArray
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println( "enter 1st array length");
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter 1st array elements");
	for(int i=0; i<a.length; i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println( "enter 2st array length");
	int m=s.nextInt();
	int b[]=new int[m];
	System.out.println("enter 2st array elements");
	for(int i=0; i<b.length; i++)
	{
		b[i]=s.nextInt();
	}
	int x[]=new int[a.length+b.length],k=0;
	for(int i=0; i<x.length; i++)
	{
		if(i<a.length)
		{
			x[k]=a[i];
			k++;
		}
	}
	for(int j=0; j<x.length; j++)
	{
		if(j<b.length)
		{
			x[k]=b[j];
			k++;
		}
	}
	for(int i=0; i<x.length; i++)
	{
		for(int j=i+1; j<x.length; j++)
		{
			if(x[i]>x[j])
			{
				int t=x[i];
				x[i]=x[j];
				x[j]=t;
			}
		}
	}
	System.out.println("new array");
	for(int i=0; i<x.length; i++)
	{
		System.out.println(x[i]);
	}
}
}
