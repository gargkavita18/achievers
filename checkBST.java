package toppers;
import java.util.*;
class Node1
{
	int data;
	Node1 left,right;
	Node1(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class checkBST 
{
static Node1 root;
//I have used arraylist as we do not know the number of nodes in a tree
static ArrayList<Integer> a=new ArrayList<Integer>();
checkBST()
{
	root=null;
}
checkBST(int data)
{
	root=new Node1(data);
}
static void inorder(Node1 root)
{
	if(root!=null)
	{
		inorder(root.left);
		a.add(root.data);
		inorder(root.right);
	}
	return ;
}
static boolean isBST(Node1 root)
{
	inorder(root);
	int i=0;
	for(i=0;i<a.size()-1;i++)
	{
		if(!(a.get(i)<=a.get(i+1)))
			break;
	}
	if(i==a.size()-1)
		return true;
	return false;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	checkBST tree=new checkBST();
	tree.root=new Node1(40);
	tree.root.left=new Node1(25);
	tree.root.right=new Node1(60);
	tree.root.left.left=new Node1(10);
	tree.root.left.right=new Node1(30);
	tree.root.right.left=new Node1(50);
	tree.root.right.right=new Node1(80);
	if(isBST(root))
	{
		System.out.println("THE TREE IS A BST");
	}
	else
		System.out.println("NOT A BST");
}
}
