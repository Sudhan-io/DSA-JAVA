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
    // to print the entire linkedlist
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
    //insert at mid
    public static void insertmid(int data, int pos){
        Node nn=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
    }
    //delete the first node
    static void delbeg(){
        if(head==null) return;
        head=head.next;
    }
    //del at end
    public static void delatend(){
        if(head==null || head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    //del a value
    public static void delval(int data){
        if(head==null){
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next.data!=data&&temp.next!=null){
            temp=temp.next;
        }
        if(temp.next!=null){
        temp.next=temp.next.next;}

    }
    public static void delatpos(int pos){
        if(head==null) return;
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

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
        insertmid(45, 2);
        printlist();
        delatend();
        printlist();
        delval(15);
        printlist();
        delatpos(1);
        printlist();x
    }
}