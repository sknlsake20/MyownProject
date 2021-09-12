package day12;
class Node
{
    int data;
    Node left, right;
  
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
  
public class BinaryTreeLambdaEx {
	Node root;
    boolean isFullTree(Node node)
   {
	if(node == null)
	{
      return true;
	}
    if(node.left == null && node.right == null)
    {
      return true;
    }
    if((node.left!=null) && (node.right!=null))
    {
      return (isFullTree(node.left) && isFullTree(node.right));
    }
    return false;
   }

public static void main(String args[])
{ 
	BinaryTreeLambdaEx tree=new BinaryTreeLambdaEx();
    tree.root = new Node(10);
    tree.root.left = new Node(20);
    tree.root.right = new Node(30);
    tree.root.left.right = new Node(40);
    tree.root.left.left = new Node(50);
    tree.root.right.left = new Node(60);
      
    if(tree.isFullTree(tree.root))
    {
       System.out.print("The binary tree is full");
    }
    else
    {
       System.out.print("The binary tree is not full");
    }
    
}
}
