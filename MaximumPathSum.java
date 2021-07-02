class Node
{
  int data;
  Node left;
  Node right;
  public Node(int key)
  {
    this.data = key;
    left = right = null;
  }
}


class MaximumPathSum
{
  public Node root;
  int max = Integer.MIN_VALUE;
static  int lat = 0;

public int maxpath(Node root)
{
  postorder(root);
  return max;
}

int maximum(int a , int b)
{
  if(a>b)
    return a;
  else
    return b;
}

  public int postorder(Node root)
    {
        if(root == null)
            return 0;

        int left = (postorder(root.left));
        int right = (postorder(root.right));
        max = maximum(max ,left + right + root.data);
        return maximum(left,right) + root.data;
    }

  public static void main(String[] args) {

    MaximumPathSum low = new MaximumPathSum();

    low.root = new Node(3);
    low.root.left = new Node(4);
    low.root.right = new Node(5);
    low.root.left.left = new Node(-10);
    low.root.left.right = new Node(4);
  //  low.root.left.right.left = new Node(10);
  //  low.root.left.right.right = new Node(14);

    System.out.println(low.maxpath(low.root));

  }
}
