import java.util.*;
public class revnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
    while(n>0){
        c=c*10+(n%10);
        n/=10;
    }    
    System.out.println(c);
   
}
}
/*
it works similir to counting thw digits but instead of counting we use the formula c=c*10+(n%10)
and n/=10; for getting the reverse */