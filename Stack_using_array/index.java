public class index {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(6);
        stack.push(5);
        stack.push(7);
        stack.push(68);
        stack.push(9);
        stack.push(10);


        System.out.println("---------------");

        stack.display();

        System.out.println("---------------");

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("---------------");

        stack.display();


    }
}
