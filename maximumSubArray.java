package toppers;
import java.util.Scanner;
public class maximumSubArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println("enter the size of subarray i.e. value of k");
		int k=sc.nextInt();
		for(int i=0;i<=n-k;i++)
		{
			int max=a[i];
			for(int j=0;j<k;j++)
			{
				if(max<a[i+j])
					max=a[i+j];
			}
			System.out.print(max+" ");
		}
		
	}

}
