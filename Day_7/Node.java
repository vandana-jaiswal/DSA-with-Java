public class Node {
    Node prev;
    int data;
    Node next;
    Node head;

    public Node(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }

    Node() {

    }

    void addLastNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
        }

    }

    void addFirstNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;

        }

    }

    

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}