class Node {
  int key;
  Node left, right;
  Node next,prev;

  public  Node(int item) {
  key = item;
  left = right = null;
  next = null;
  }
}

class Leftview
{
  Node root = null;
  Node head = null;
  Node tail = null;

  public void EnQueue(Node root)
  {
    if(head == null)
    {
      head = tail = root;
    }
    else
    {
      tail.next = root;
      tail = root;
    }
  }

  Node  DeQueue()
{

    Node temp = head;

        head = head.next;
        return temp;
}

 boolean isEmpty()
{
    if(head == null)
    {
        return false;
    }

    return true;
}

public int Size()
{
    Node temp = head;
    int size=0;
    while (temp != null)
    {
        size++;
        temp=temp.next;
    }
    return size;
}

public void traverseTree(Node root, int count) {

  if(root == null)
    {
        return;
    }

    EnQueue(root);

    while(isEmpty())
    {
        int i;
        int size = Size();

        for(i=1;i<=size;i++)
        {
             Node temp = DeQueue();
            if(i==1)
            {
                System.out.println(temp.key + " ");
                count++;
            }

            if(temp.left != null)
            {
                EnQueue(temp.left);
            }

            if(temp.right != null)
            {
                EnQueue(temp.right);
            }
        }
    }
    System.out.println("count: "+ count);
  }

  public static void main(String[] args) {

    Leftview tree = new Leftview();

    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.left.left = new Node(5);
    tree.root.right.left = new Node(6);

    System.out.print("\nBinary Tree: ");
    int count = 0;
    tree.traverseTree(tree.root, count);
  }
}
