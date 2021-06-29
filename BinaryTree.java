
class Node {
  int key;
  Node left, right;
  Node next,prev;

  public Node(int item) {
  key = item;
  left = right = null;
  next = prev = null;
  }
}

class BinaryTree
{
  Node root = null;
  Node head = null;
  Node tail = null;

  public void doubly(Node root)
  {
    if(head == null)
    {
      head = tail = root;
    }
    else
    {
      tail.next = root;
      root.prev = tail;
      tail = root;
    }
  }

  public void display()
  {
    System.out.println();
    Node temp = head;
    System.out.print("the doublylinkedlist is: ");
    while(temp != null)
    {
      System.out.print(temp.key + " ");
      temp = temp.next;
    }
  }

  public void traverseTree(Node node) {
    if (node == null) {
      return;
    }

      traverseTree(node.left);
      System.out.print(" " + node.key);
      doubly(node);
      traverseTree(node.right);
    }

  public static void main(String[] args) {

    BinaryTree tree = new BinaryTree();

    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);

    System.out.print("\nBinary Tree: ");
    tree.traverseTree(tree.root);
    tree.display();

  }
}
