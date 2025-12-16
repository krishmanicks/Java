package src.main.java;

class Linked {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public Node head;
    public Node tail;

    public void create(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node trav = head;
        while (trav != null) {
            System.out.println(trav.data + " ");
            trav = trav.next;
        }
    }


    public static void main(String[] args) {
        Linked list = new Linked();
        list.create(1);
        list.create(2);
        list.create(5);
        list.create(7);
        list.create(9);

        list.display();
    }
}
