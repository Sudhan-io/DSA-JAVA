import java.util.*;

public class recincnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        recu(n,1);
    }
public  static void recu(int n, int c){
    if(c==n+1){
        return;
    }
    System.out.println(c);
    recu(n,c+1);
}
}
