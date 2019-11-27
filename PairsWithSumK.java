package toppers;
import java.util.*;
public class PairsWithSumK 
{
	static void pairsSumK(int[] a1,int[] a2,int k)
	{
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]+a2[j]==k)
					System.out.print(a1[i]+" "+a2[j]+", ");
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of elements for first array");
		int n=sc.nextInt();
		int []a1=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		a1[i]=sc.nextInt();
		System.out.println("enter no. of elements for second array");
		int m=sc.nextInt();
		int []a2=new int[m];
		System.out.println("enter array elements");
		for(int i=0;i<m;i++)
		a2[i]=sc.nextInt();
		System.out.println("enter the value of k");
		int k=sc.nextInt();
		pairsSumK(a1,a2,k);
	}

}
