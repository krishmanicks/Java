class Trie
{

  private Node root;

  public Trie()
  {
    root = new Node('\0');
  }

  public void insert(String word)
  {
    Node curr = root;
    for(int i=0;i<word.length();i++)
    {
      char c = word.charAt(i);
      if(curr.children[c - 'a'] == null)
      {
        curr.children[c - 'a'] = new Node(c);
      }
      curr = curr.children[c - 'a'];
    }
    curr.isword = true;
  }


  public boolean search(String word)
  {
    Node node = getNode(word);
    return node != null && node.isword;
  }

  private Node getNode(String word)
  {
    Node curr = root;
    for(int i=0;i<word.length();i++)
    {
      char c =word.charAt(i);
      if(curr.children[c - 'a'] == null)
        return null;

      curr = curr.children[c - 'a'];
    }
    return curr;
  }

  public boolean startswith(String prefix)
  {
    return getNode(prefix) != null;
  }

  class Node
  {
    public char c;
    public boolean isword;
    public Node[] children;

    public Node(char c)
    {
      this.c = c;
      isword = false;
      children = new Node[26];
    }
  }
}
