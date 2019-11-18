package toppers;
import java.util.*;

class Node
 {
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class duplicateDeletionLL 
{
	static Node head;
	public static Node insert(Node head,int data){
		Node newNode=new Node(data);
		newNode.next=null;
		if(head==null)
			head=newNode;
		else{
			Node last=head;
			while(last.next!=null)
				last=last.next;
			last.next=newNode;
		}
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
	public static Node duplicateRemoval(Node head)
	{
		Node current=head;
		while(current!=null)
		{
			Node temp=current;
			Node temp1=current.next;
			while(temp1!=null)
			{
				if(temp1.data==current.data)
				{
					temp.next=temp1.next;
				}
				else
				{
				temp=temp.next;
				}
				temp1=temp1.next;
			}
			current=current.next;
		}
		return head;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements you want to insert in a linked list");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int data=sc.nextInt();
		head=insert(head,data);
	}
	System.out.println("linked list is:");
	display(head);
	System.out.println("linked list after duplicate removal is:");
	head=duplicateRemoval(head);
	display(head);
}
}
