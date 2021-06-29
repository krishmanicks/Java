class Stack
{
  class Node
  {
      int data;
      Node next;
      Node(int key)
      {
        this.data = key;
        this.next = null;
      }
  }

  public Node head;

  public void push(int key)
  {
    Node newNode = new Node(key);

    if(head == null)
    {
      head = newNode;
    }
    else
    {
      newNode.next = head;
      head = newNode;
    }
  }

public void pop()
{
  Node temp = head;
  head = head.next;
}

public void display()
{
  Node trav = head;
  while(trav != null)
  {
    System.out.println(trav.data+" ");
    trav = trav.next;
  }
  System.out.println();
}

public static void main(String args[])
{
  Stack s = new Stack();
  s.push(1);
  s.push(2);
  s.push(3);
  s.push(4);
  s.push(5);

  s.display();

  s.pop();

  s.display();

}



}
