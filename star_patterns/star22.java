import java.util.*;
public class star22 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<2*n-1;i++){
        for(int j=0;j<n*2-1;j++){
            int top=i;
            int bottom=j;
            int left=(2*n-2)-i;
            int right=(2*n-2)-j;
            int min=Math.min(Math.min(top,bottom),Math.min(left,right));
            System.out.print(n-min);
        }
        System.out.println();
       } 
    }
    
}
/*
4444444
4333334
4322234
4321234
4322234
4333334
4444444

*/