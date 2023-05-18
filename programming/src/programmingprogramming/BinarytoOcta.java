package programmingprogramming;

import java.util.Scanner;

public class BinarytoOcta
{
	public static void main(String[] args) 
	{
		System.out.println("enter a hexadecimal no.");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int x=hexToDec(n);
		System.out.println(x);
		String s1=decToBin(x);
		System.out.println(s1);
		
	}
	public static int hexToDec(int n)
	{
		int dec=0,pow=1;
		while(n>0)
		{
			int r=n%10;
			dec=dec+r*pow;
			pow=pow*16;
			n=n/10;
		}
		return dec;
	}
	public static String decToBin(int x) 
	{
		String bin=" ";
		while(x>0)
		{
			int r=x%2;
			bin=r+bin;
			x=x/2;
		}
		return bin;
	}

}
