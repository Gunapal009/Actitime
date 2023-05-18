package programmingprogramming;

import java.util.Scanner;

public class Userenteredindexintospecifiedindex 
{
public static void main(String [] args)
{
	System.out.println("enter array length");
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter array elements");
	for(int i=0; i<a.length; i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("enter the element to add");
	int ele=s.nextInt();
	System.out.println("enter the index");
	int ind=s.nextInt();
	int y[]=insert(a,ele,ind);
	System.out.println("new array");
	for(int i=0; i<y.length; i++)
	{
		System.out.println(y[i]);
	}
}
public static int[] insert(int a[], int ele, int ind)
{
	int b[]=new int[a.length+1];
	if(ind<0||ind>a.length)
	{
		System.out.println("invalid index entered");
		return a;
	}
	else
	{
		b[ind]=ele;
		for(int i=0; i<a.length; i++)
		{
			if(i<ind)
			{
				b[i]=a[i];
			}
			else
			{
				b[i+1]=a[i];
			}
		}
		return b;
	}
	
	
		
}
}
