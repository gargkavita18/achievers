package toppers;
import java.util.Scanner;
class Node2
{
	int key;
	Node2 left;
	Node2 right;

	Node2(int d) {
		key = d;
		left = right = null;
	}
}
public class LeftViewOfTree {
	static Node2 root;
	static int c=0;
	LeftViewOfTree()
	{
		root=null;
	}
	LeftViewOfTree(int data)
	{
		root=new Node2(data);
	}
	public static int heightTree(Node2 root) {
		int count1 = 0;
		int count2 = 0;
		if (root == null)
			return 0;
		count1 = heightTree(root.left);
		count1++;
		count2 = heightTree(root.right);
		count2++;
		if (count1 >= count2)
			return count1;
		else
			return count2;
	}
	public static void view(Node2 root)
	{
		int h=heightTree(root);
		c=0;
		for(int i=1;i<=h;i++)
		{
			c=1;
		  leftview(root,i);
		}
	}
	public static void leftview(Node2 root,int level)
	{
		if(root==null)
		{
			return;
		}
		else if(level==1 && c==1)
		{
			c++;
			System.out.print(root.key+" ");
		}
		else
		{
			leftview(root.left,level-1);
			leftview(root.right,level-1);
		}
	}
	public static void main(String[] args) {
		 LeftViewOfTree tree=new  LeftViewOfTree(1);
		tree.root.left=new Node2(2);
		tree.root.right=new Node2(3);
		tree.root.left.left=new Node2(4);
		tree.root.left.right=new Node2(5);
		tree.root.right.left=new Node2(6);
		tree.root.right.right=new Node2(7);
		System.out.println("The left view of tree is:");
		view(root);
		
	}

}

