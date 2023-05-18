package programmingprogramming;

import java.util.Scanner;

public class PrimeNoMatrix
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("enter row");
int r=sc.nextInt();
System.out.println("enter col");
int c=sc.nextInt();
int ar[][]=new int[r][c];
System.out.println("enter"+r*c+"elements");
for(int i=0; i<ar.length; i++)
{
	for(int j=0; j<ar[i].length; j++)
	{
		ar[i][j]=sc.nextInt();
	}
}
System.out.println("no. of prime no. in matrix");
int count=0;
for(int i=0; i<ar.length; i++)
{
	for(int j=0; j<ar[i].length; j++)
	{
		boolean b=isPrime(ar[i][j]);
		if(b==true)
			count++;
	}
}
System.out.println(count);
}
static boolean isPrime(int n)
{
	int c=0;
	for(int i=1; i<=n; i++)
	{
		if(n%i==0)
		{
			c++;
		}
	}
	return c==2;
}
}