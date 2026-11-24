import java.util.*;
public class traficsignal {

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<60){
            System.out.println("invalid number");
            return;
        }
        int nr=n%60;
        int nq=n/60;
        if(nq%3==1){
            System.out.println("red");
        }else if(nq%3==2){
            System.out.println("Yellow");
        }else{
            System.out.println("Green");
        }
        return;
    }
}