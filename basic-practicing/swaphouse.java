/*import java.util.*;
public class swaphouse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=n+"";
        String s="";
        int odd=0;
        int even=1;
        for(int i=0;i<4;i++){
            s+=str.charAt(even)+""+str.charAt(odd)+"";
            odd+=2;
            even+=2;
        }
        int res=Integer.parseInt(s);
        System.out.println(res);
    }
} */
import java.util.*;
public class swaphouse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1,lasttwo=0,resu=0,last=0,lastt=0,result=0;
        for(int i=0;i<4;i++){
            lasttwo=n%100;
            last=lasttwo%10;
            lastt=lasttwo/10;
            resu=last*10+lastt;
            result+=resu*mul;
            mul*=100;
            n/=100;
        }
        System.out.println(result);
    }
}
