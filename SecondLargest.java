package toppers;
import java.util.*;
public class SecondLargest 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		Arrays.sort(a);
		System.out.println("Largest - "+a[n-1]);
		System.out.println("Second - "+a[n-2]);
	}

}
