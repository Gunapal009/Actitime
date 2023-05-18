package programmingprogramming;

import java.util.Scanner;

public class RemoveDupllicateWordsinString
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
String st = s.nextLine();
char ch[]= st.toCharArray();
for(int i=0; i<ch.length; i++)
{
	for(int j=i+1; j<ch.length; j++)
	{
		if(ch[i]==ch[j])
		{
			ch[j]='0';
		}
	}
	if(ch[i]!='0')
	{
		System.out.print(ch[i]);
	}
}
}
}
