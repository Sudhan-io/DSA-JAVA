import java.util.*;
public class ispalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int c=0;
    while(n>0){
        c=c*10+(n%10);
        n/=10;
    }    
    if(c==temp) System.out.print(true);
    else{System.out.print(false);}
   
}
}
/*
after finding the reverse it compares it with the initial value which is stored in a duplicate variable and prints the result */