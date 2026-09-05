import java.util.*;
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
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    static Node head;
    public static void main(String[] args) {
        head = new Node(5);
        head.next=new Node(15);
        head.next.next=new Node(30); 
        printlist();
        insertatbeg(67);
        printlist();
    }
}