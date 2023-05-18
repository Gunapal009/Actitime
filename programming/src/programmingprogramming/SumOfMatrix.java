package programmingprogramming;

import java.util.Scanner;

public class SumOfMatrix 
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
	int sum=0;
	for(int i=0; i<ar.length; i++)
	{
		
		for(int j=0; j<ar[i].length; j++)
		{
			sum=sum+ar[i][j];
		}
		
	}
	System.out.println("sum ="+sum); 
	}
}
