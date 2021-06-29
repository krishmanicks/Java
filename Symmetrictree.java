class Node
{
  int data;
  Node left,right;

  public Node(int item)
    {
      data = item;
      left = right = null;
    }
}
class Symmetrictree
{
  Node root = null;

public boolean symmetric(Node root)
{
  if(root == null)
    return true;

  return issys(root.left, root.right);
}

public boolean issys(Node left , Node right)
{
  if(left == null || right == null)
  {
    return left == right;
  }

  if(left.data != right.data)
  {
    return false;
  }

  return issys(left.left, right.right) && issys(left.right, right.left);
}

  public static void main(String args[])
  {
    Symmetrictree sym = new Symmetrictree();

    sym.root = new Node(5);
    sym.root.left = new Node(1);
    sym.root.right = new Node(1);
    sym.root.left.left = new Node(2);
    sym.root.right.right = new Node(3);

    System.out.println(sym.symmetric(sym.root));
  }
}
