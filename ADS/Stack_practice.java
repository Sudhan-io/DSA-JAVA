public class Stack_practice {

    static int stack[] = new int[5] ;
    static int top = -1 ;

    //PUSH
    public static void push (int value){
        if(top == stack.length-1){
            System.out.println("Stack Full..");
            return;
        }
        top++;
        stack[top]=value;
        System.out.println("Inserted Value Successfullyy..");
    }

    //POP
    public static void pop(){
        if(top == -1){
            System.out.println("Stack Emptyy..");
            return;
        }
        System.out.println(stack[top]+"Value poped Successfullyy..");
        top--;
    }

    //PEEK
    public static void peek(){
        if(top == -1){
            System.out.println("Stack Emptyy..");
            return;
        }
        System.out.println(stack[top]);
    }

    //DISPLAY
    public static void display(){
        if(top == -1){
            System.out.println("Stack Emptyy..");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]+" ");
        }
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push (4);
        push (5);
        display();
        System.out.println("POP ");
        pop();

        System.out.println("PEEK ");
        peek();

        System.out.println("DISPLAYING THE STACK");
        display();
    }
}