package toppers;
import java.util.*;
public class MinDiffer
{
	public static void min(int arr[],int s)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<=arr.length-s;i++)
		{
			int diff=arr[i+s-1]-arr[i];
			if(diff<min)
			{
				min=diff;
			}
		}
		System.out.println("The min diff b/W max and min packets size is:"+min);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of packets:");
		int n=sc.nextInt();
		System.out.println("Enter the no. of chocolates in each packet:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of students:");
		int s=sc.nextInt();
		min(arr,s);

}

}
