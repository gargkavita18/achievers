package toppers;
import java.util.*;
public class subarray {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements in a array");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("enter array elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the sum ");
	int m=sc.nextInt();
	int count=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{
			int sum=0;
			for(int k=i;k<=j;k++)
			{
				sum=sum+arr[k];
			}
			if(sum==m)
			{
				count++;
				System.out.println("starting index: "+i+", ending index: "+j);
			}
		}
	}
	if(count==0)
	{
		System.out.println("no such subarray having sum: "+m);
	}
}
}