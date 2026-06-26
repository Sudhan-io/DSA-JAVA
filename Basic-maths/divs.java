import java.util.*;
public class divs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> res=new  ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                res.add(i);
                if(i!=n/i){
                    res.add(n/i);
                }
            }
        }
        Collections.sort(res);
        for( int each : res){
            System.out.print(each+" ");
        }
}
}