import java.util.Scanner;
public class star12 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int spaces=2*(n-1);
       for(int i=1;i<n+1;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int b=0;b<spaces;b++){
            System.out.print(" ");
        }
        for(int k=i;k>0;k--){
            System.out.print(k);
        }
        spaces-=2;
        System.out.println();
       }
    }
}   
/*
1        1
12      21
123    321
1234  4321
1234554321

*/