package src.main.java;

public class Node {
    int data;
    Node left, right;
    Node next;

    public Node(int item) {
        data = item;
        left = right = null;
        next = null;
    }
}
