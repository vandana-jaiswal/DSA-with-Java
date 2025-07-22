
public class LinkedList {
    
    public static void main(String[] args) {
        Node obj = new Node();
        obj.addToFirst(5);
        obj.addToFirst(4);
        System.out.println("-----------");

        obj.addLast(3);
        obj.display();
    
         System.out.println("-----------");

        obj.sum();
        obj.display();
        System.out.println("-----------");

        
        obj.addSpecificPosition(43,1 );
        obj.display();
         System.out.println("-----------");

        obj.deletFirst();
        obj.display();
         System.out.println("-----------");

        obj.deletLast();
        obj.display();
         System.out.println("-----------");

        obj.delSpecificPosition(1);
        obj.display();
         System.out.println("-----------");

        // obj.replaceData(1,65);
        // obj.display();


        


        

    }

}
