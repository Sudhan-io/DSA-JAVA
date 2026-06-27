import java.util.*;

public class rec1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        recu(s,n,0);
    }
public  static void recu(String s, int n, int c){
    if(c==n){
        return;
    }
    System.out.println(s);
    recu(s,n,c+1);
}
}
