package programmingprogramming;

import java.util.Scanner;

public class Occuranceofeachelement 
{
public static void main(String[] args)
{
Scanner s =new Scanner(System.in);
System.out.println("enter array length");
int n=s.nextInt();
int a[] = new int[n];
System.out.println("enter array elements");
for(int i=0; i<a.length; i++)
{
	a[i]=s.nextInt();
}
boolean rs[]=new boolean[n];
for(int i=0; i<a.length; i++)
{
	int c=1;
	if(rs[i]==false)
	{
	for(int j=i+1; j<a.length; j++)
	{
			if(a[i]==a[j])
			{
				c++;
				rs[j]=true;
			}
		
	}
	System.out.println(a[i]+" "+c+"times");
	}	
}
}
}
 