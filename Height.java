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
class Height
{
  Node root = null;


 int depth(Node node)
{
  if(node == null)
  {
      return 0;
  }
  else
  {
    int maxDepth =  depth(node.left);
    int maxdep = depth(node.right);

    int c = maxDepth > maxdep ? maxDepth : maxdep;
    return c+1;
  }
}

  public static void main(String args[])
  {
    Height sym = new Height();

    sym.root = new Node(5);
    sym.root.left = new Node(1);
    sym.root.right = new Node(1);
    sym.root.left.left = new Node(2);
    sym.root.right.right = new Node(3);
    sym.root.left.left.left = new Node(1);
    sym.root.left.left.left.left = new Node(2);
  //  sym.root.left.left.left.left.left = new Node(2);


    System.out.println(sym.depth(sym.root));
  }
}
