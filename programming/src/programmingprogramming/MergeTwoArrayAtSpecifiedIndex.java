package programmingprogramming;

import java.util.Scanner;

public class MergeTwoArrayAtSpecifiedIndex 
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter 1st array length");
int n=s.nextInt();
int a[] = new int[n];
System.out.println("enter 1st array elements");
for(int i=0; i<a.length; i++)
{
	a[i]=s.nextInt();
}
System.out.println("enter 2nd array length");
int n1=s.nextInt();
int b[] = new int[n1];
System.out.println("enter 2nd array elements");
for(int i=0; i<b.length; i++)
{
	b[i]=s.nextInt();
}
System.out.println("enter index to add 2nd array");
int in=s.nextInt();
System.out.println("new array");
int z[]=specify(a,b,in);for(int i=0; i<z.length; i++)
{
	System.out.println(z[i]);
}
}

private static int[] specify(int[] a, int[] b, int in) 
{
	int z[]=new int[a.length+b.length];
	int i=0,j=0,k=0;
		while(i<in)
		{
			z[k]=a[i];
			k++;
			i++;
			
		}
		while(j<b.length)
		{
			z[k]=b[j];
			k++;
			j++;
		}
		while(i<a.length)
		{
			z[k]=a[i];
			k++;
			i++;
		}
	return z;
}

}
