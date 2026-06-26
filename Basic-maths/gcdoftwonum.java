import java.util.*;
public class gcdoftwonum {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
       int a=sc.nextInt();
       int b=sc.nextInt();
       while(a>0 && b>0){
        if(a>b){
            a%=b;
        }
        else{
            b%=a;
        }
       }
       if(a>b) System.out.print(a);
       else{System.out.print(b);}
   
}
}
/*
we used the Euclidean Algorithm
*/