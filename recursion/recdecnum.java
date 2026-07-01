import java.util.*;

public class recdecnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        recu(n);
    }
public  static void recu(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    recu(n-1);
}
}
