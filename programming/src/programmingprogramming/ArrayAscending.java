package programmingprogramming;

import java.util.Scanner;

public class ArrayAscending 
{
public static void main(String[] args)
{
System.out.println("enter array length");
Scanner s= new Scanner(System.in);
int n = s.nextInt();
int a[] = new int[n];
System.out.println("enter array elements");
for(int i=0; i<a.length; i++)
{
	a[i]=s.nextInt();
}
for(int i=0; i<a.length; i++)
{
	for(int j=i+1; j<a.length;j++)
	{
		if(a[i]>a[j])
		{
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
		}
	}
}
System.out.println("array in ascending");
for(int i=0; i<a.length;i++)
{
	System.out.println(a[i]);
}
}
}
