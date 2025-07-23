
public class Queue {
    int front=0;
    int rear=-1;

    int size = 5;
    int[] ar = new int[size];

    Queue(){

    }

    void eq(int data){

        if(rear !=size-1){  
        rear++;
        ar[rear] = data;
        System.out.println("data push in q");
    }
}
    void dq(){
        if(front>rear){
            System.out.println("q khali ho gai hai ab delet nhi kar sakte");

        }else{
            front++;
            System.out.println("data delet in q");
        }
    }

    void display(){
        if(front>rear){
            System.out.println("q khali hai");
        }else{
            for(int i =front; i<=rear;i++){
                System.out.println(ar[i]);
            }
        }
    }
    
}
