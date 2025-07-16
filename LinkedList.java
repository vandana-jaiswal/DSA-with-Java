public class LinkedList {
    Node head;

    void addToFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            newNode.next = null;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void addLast(int data){
        Node newNode = new Node(data);
       Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    



    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.addToFirst(5);
        obj.addToFirst(4);
        

        obj.addLast(34);
        obj.display();
    }

}
