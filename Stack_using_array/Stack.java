class Stack{
    int size = 5;
    int top = -1;
    int[] s = new int[size];

    Stack(){

    }

    public void push(int data){
        if(top<size-1){
            top++;
            s[top] = data;
            System.out.println("data push ho chuka hai");
        }else{
            System.out.println("Stack overflow , cant insert data");
        }
    }

    void display(){
        int disp = top;
        
        if(top==-1){
            System.out.println("stack pura khali hai display karne ke liye kuch bhi nhi hai byy");
        }
        while(disp!=-1){
            System.out.println(s[disp]);
            disp--;


        }
    }

    void pop(){
        if(top!=-1){
            s[top] = 0;
            top-- ;
            System.out.println("data vpop ho chuka hai");
        }else{
            System.out.println("stack khali ho chuka hai");
        }
    }

}