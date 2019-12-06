package toppers;
import java.util.*;
public class highestPrime 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int n =sc.nextInt();
	if(n<2)
	{
		System.out.println("prime number does not exist");
	}
	else
	{
	int prime=2;
	for(int i=3;i<=n;i+=2)
	{
		int max=0;
		int j=3;
		for(;j<=i;j++)
		{
			if(i%j==0)
				max++;
		}
		if(max==1&&prime<i)
			prime=i;
	}
	System.out.println("the highest prime number before "+n+" is:"+prime);
	}
}
}
