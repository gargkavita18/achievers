package linkedlist1;
import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
		next=null;
	}
}
public class reverse {
	static Node head;
	public static Node insertEnd(Node head,int data)
	{
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
	head=insertEnd(head,20);
	head=insertEnd(head,30);
	head=insertEnd(head,40);
	head=insertEnd(head,50);
	head=insertEnd(head,60);
	head=insertEnd(head,70);
	head=reverse1(head);
	display(head);
}
}
