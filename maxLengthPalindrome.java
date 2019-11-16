package toppers;
import java.util.*;
public class maxLengthPalindrome {
	public static int checkPalindrome(String s)
	{
		int l=0;
		int i=0;
		int n=s.length();
		for(i=0;i<n;i++)
		{
			if(s.charAt(i)!=s.charAt(n-1-i))
				break;
		}
		if(i==n)
		return i;
		else return l;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		String [] st=new String[100];
		int k=0;
		int m=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String str=s.substring(i,j);
				m=checkPalindrome(str);
				if(m!=0)
				{
					st[k]=str;
					k++;
				}
			}
		}
		int max=0;
		String palin="";
		for(int i=0;i<k;i++)
		{
			if(st[i].length()>max)
				{
				max=st[i].length();
				palin=st[i];
				}
		}
		System.out.println(palin);
	}
}
