package programmingprogramming;

import java.util.Scanner;

public class AddTwoMatrix 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st matrix row");
	int r1=sc.nextInt();
	System.out.println("enter 1st matrix col");
	int c1=sc.nextInt();
	int ar1[][]=new int[r1][c1];
	System.out.println("enter"+r1*c1+"elements for 1st matrix");
	for(int i=0; i<ar1.length; i++)
	{
		for(int j=0; j<ar1[i].length; j++)
		{
			ar1[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter 2nd matrix row");
	int r2=sc.nextInt();
	System.out.println("enter 2nd matrix col");
	int c2=sc.nextInt();
	int ar2[][]=new int[r2][c2];
	System.out.println("enter"+r2*c2+"elements for 2nd matrix");
	for(int i=0; i<ar2.length; i++)
	{
		for(int j=0; j<ar2[i].length; j++)
		{
			ar2[i][j]=sc.nextInt();
		}
	}
	add(ar1, ar2);
	
	}

	static void add(int[][] ar1, int[][] ar2) 
	{
		
		
	}

}
