package toppers;
import java.util.*;
public class ReverseWholeString 
{
	public static void reverseString(String s)
	{
		String s1[]=s.split("\\.");
		for(int i=(s1.length)-1;i>0;i--)
		{
			System.out.print(s1[i]+".");
		}
		System.out.println(s1[0]);
	}
public static void main(String args[])
{
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	reverseString(s);
}
}
