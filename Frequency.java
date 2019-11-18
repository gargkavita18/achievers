package classDSQuestions;
import java.util.*;
public class Frequency {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements you want to enter in array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				int count=1;
			for(int j=i+1;j<n;j++){
				if(arr[j]!=0){
				if(arr[i]==arr[j]){
					count++;
					arr[j]=0;
				}
			}
			}
			System.out.println(arr[i]+" "+count);
		}
		}
	}
}
