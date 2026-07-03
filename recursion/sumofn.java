
import java.util.*;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        recu(n,0);
    }
public  static void recu(int n,int c){
    if(n==0){
        System.out.println(c);
        return;
    }
    c+=n;
    //System.out.println(c);
    recu(n-1,c);
}
}