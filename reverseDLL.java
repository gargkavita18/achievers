package linkedlist1;
import java.util.*;
class Node
{
	int data;
	Node next,prev;
	Node(int d)
	{
		data=d;
	}
}
public class reverse {
	static Node head;
	public static Node insertEnd(Node head,int d)
{
	Node n=new Node(d);
	if(head==null)
		{
		head=n;
		System.out.println("node inseted");
		}
	else
	{
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=n;
		n.prev=temp;
		n.next=null;
		System.out.println("node inserted");
	}
	return head;
}
	public static Node reverse1(Node head)
	{
		Node prev=null,next=null,current=head;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}
	public static void display(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
                  System.out.println("enter the number of elements");
	int n=sc.nextInt();
	System.out.println("enter elements");
	for(int i=0;i<n;i++)
	{
	int data=sc.nextInt();
	head=insertEnd(head,data);
	}
	head=reverse1(head);
	display(head);
}
}
