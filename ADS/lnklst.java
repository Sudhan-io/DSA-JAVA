//import java.util.*;
public class lnklst {
    static class Node{
        int data;
        Node next;
        Node(int a){
            this.data=a;
            this.next=null;
        }
    }
    // to prit the entire linkedlist
    static void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //insert at beginning
    public static void insertatbeg(int data){
        if(head==null){
            Node newNode=new Node(data);
            head=newNode;
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    //insert at end
    public static void insertend(int data){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
    }
    static Node head;
    public static void main(String[] args) {
        head = new Node(5);
        head.next=new Node(15);
        head.next.next=new Node(30); 
        printlist();//caling the method printlit to print the entire linkedlist
        insertatbeg(67);//the method insertatbeg inserts a new node and make it as head so practically making it as the head node since it is inserted at beginning
        printlist();
        insertend(21);
        printlist();
    }
}