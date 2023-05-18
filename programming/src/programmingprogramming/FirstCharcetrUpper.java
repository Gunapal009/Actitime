package programmingprogramming;

import java.util.Scanner;

public class FirstCharcetrUpper
{
public static void main(String[] args) 
{
Scanner s = new Scanner(System.in);
System.out.println("enter a string");
String st= s.nextLine();
char ch[]= st.toCharArray();
for(int i=0; i<ch.length; i++)
{
	if( i==0&&ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' ')
	{
		if(ch[i]>='a'&&ch[i]<='z')
		{
			ch[i]=(char)(ch[i]-32);
		}
	}
	else if(ch[i]>='A'&&ch[i]<='Z')
	{
		ch[i]=(char)(ch[i]+32);
	}
}
st=new String(ch);
System.out.println("new string");
System.out.println(st);
}
}
