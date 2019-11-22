package toppers;
import java.util.*;
public class MaxEleGreThaKSub {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements in a array");
	int n=sc.nextInt();
	System.out.println("the array is");
	int [] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("enter value of k");
	int k=sc.nextInt();
	int count=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{
			int max=0;
			for(int m=i;m<=j;m++)
			{
				if(max<a[m])
					max=a[m];
			}
			if(max>k)
				count++;
		}
	}
	System.out.println(count);
}
}
