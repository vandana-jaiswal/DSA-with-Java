public class Node {
    int data;
    Node next;
    Node head;

    Node(int data) {
        this.data = data;
        this.next = null;

    }

    Node() {

    }

    void addToFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = null;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    void sum() {
        Node temp = head;
        int sum = 0;

        while (temp != null) {
            sum = sum + temp.data;
            temp = temp.next;
        }

        System.out.println(sum);
    }

    void addSpecificPosition(int data, int index) {
        Node newNode = new Node(data);

        Node temp1 = null;
        Node temp = head;

        if (index == 0) {
            newNode.next = head;
        }

        for (int i = 0; i < index - 1; i++) {

            temp = temp.next;
        }
        temp1 = temp.next;
        newNode.next = temp1;
        temp.next = newNode;
    }

    void deletFirst() {
        head = head.next;
    }

    void deletLast() {
        Node temp = head;

        if (head.next == null) {
            head = null;
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void delSpecificPosition(int index) {
        Node temp = head;

        if (head != null) {

            if (index == 0) {
                head = head.next;
            }

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    void replaceData(int index, int data) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.data = data;
    }

}
