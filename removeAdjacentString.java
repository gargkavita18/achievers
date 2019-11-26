package toppers;
import java.util.*;
public class removeAdjacentString 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		String r="";
		if(s.charAt(0)!=s.charAt(1))
			r=r+s.charAt(0);
		for(int i=1;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=s.charAt(i-1)&&s.charAt(i)!=s.charAt(i+1))
				r=r+s.charAt(i);
		}
			if(s.charAt(s.length()-1)!=s.charAt(s.length()-2))
				r=r+s.charAt(s.length()-1);
			System.out.println("the updated string is: "+r);
	}
}
