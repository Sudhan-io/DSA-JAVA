import java.util.*;
public class chef {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(21-(A+B)<=10){
            System.out.println(21-(A+B));
        }else{
            System.out.println(-1);
        }
    }
}