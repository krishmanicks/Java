package src.main.java;

public class LowestAncestor {
    public Node root;

    Node LCA(Node node, int n1, int n2) {
        while (node != null) {
            if (node.data > n1 & node.data > n2)
                node = node.left;

            else if (node.data < n1 & node.data < n2)
                node = node.right;

            else
                break;
        }
        return node;
    }

    public static void main(String[] args) {
        LowestAncestor low = new LowestAncestor();

        low.root = new Node(20);
        low.root.left = new Node(8);
        low.root.left.left = new Node(4);
        low.root.right = new Node(22);
        low.root.left.right = new Node(12);
        low.root.left.right.left = new Node(10);
        low.root.left.right.right = new Node(14);

        int n1 = 10, n2 = 4;
        System.out.println(low.LCA(low.root, n1, n2).data);

    }
}
