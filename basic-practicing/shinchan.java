import java.util.*;
public class shinchan {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int shinshare=sc.nextInt();
        int himashare=sc.nextInt();
        int torushare=total-(shinshare+himashare);
        float toruperc=(((float)torushare/total))*100;
        System.out.println("toru share:"+torushare);
        System.out.printf("toru percentage: %.2f%%%n", toruperc);


    }
}