import java.util.*;

class Pretopost
{
  static class Node
  {
    char data;
    Node left,right;
  public Node (char data)
    {
      this.data = data;
    }
  }

static Node build( char in[], char pre[])
{
    int inindex = 0, preindex = 0,flag = 0;

    java.util.Stack<Node> stk = new java.util.Stack<>();

    Node root = null,prev = null,node=null;

    root  = prev = new Node(pre[preindex]);
    preindex++;
    stk.push(root);

    while(preindex < pre.length)
    {
      if(!stk.isEmpty() && in[inindex] == stk.peek().data)
      {
        prev = stk.pop();
        inindex++;
        flag = 1;
      }
      else
      {
         node = new Node(pre[preindex]);
          if(flag == 0)
          {
            prev.left = node;
            prev = prev.left;
          }
          else
          {
            prev.right = node;
            prev = prev.right;
            flag = 1;
          }
          stk.add(node);
          preindex++;
      }
    }
    return root;
}

public static void inorder(Node root)
{
  if(root == null)
  {
    return;
  }

  inorder(root.left);
  System.out.println(root.data + " ");
  inorder(root.right);
}


  public static void main(String args[])
  {
    char[] inorder = {'H','D', 'P','L','A','Z','C','E'};
    char[] preorder = {'A','D','H','L','P','Z','C','E'};

    Node root = build(inorder, preorder);

    inorder(root);
  }
}
