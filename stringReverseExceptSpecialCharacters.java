package toppers;
import java.util.*;
public class stringReverseExceptSpecialCharacters {
	static boolean ischar(char c)
	{
		 if(c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9')
		 {
			 return true;
		 }
		return false;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next();
	char[] c=s.toCharArray();
	int l=0,n=c.length-1;
	while(l<n)
	{
		if(!ischar(c[l]))
			l++;
		else if(!ischar(c[n]))
			n--;
		else
		{
			char t=c[l];
			c[l]=c[n];
			c[n]=t;
			l++;
			n--;
		}
	}
	System.out.println(c);
	
	
}
}
