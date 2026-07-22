import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //sc.nextLine();
        //String s=sc.nextLine();
        System.out.println(fact(n));
    }
public  static int fact(int n){
    if(n==0){
        return 1;
    }else return n*fact(n-1);
    
}
}
/*
n=5
op:120 */