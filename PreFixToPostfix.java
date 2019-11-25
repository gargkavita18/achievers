package toppers;
import java.util.*;
public class PreFixToPostfix
{
	static boolean isCharacter(char c){
		return ((c >= 'a' && c <= 'z') ||
				(c >= 'A' && c <= 'Z') ||
				(c >= '0' && c <= '9'));
	}
	public static String preTopost(String str){
		Stack<String> s = new Stack<String>();
		String res=new String("");
		int n=str.length();
		for(int i=n-1;i>=0;i--){
			char c=str.charAt(i);
			if(isCharacter(c)){
				s.push(c+"");
			}
			else{
				String a=s.pop();
				String b=s.pop();
				res=a+b+c;
				s.push(res);
			}
		}
		return res;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String in Prefix:");
		String str=sc.next();
		System.out.println("string in prefix:"+str);
		System.out.println("String in PostFix: "+preTopost(str));
	}
}
