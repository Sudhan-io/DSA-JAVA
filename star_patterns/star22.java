import java.util.Scanner;
public class star22 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=n*2-1;i>=1;i--){
        for(int j=n*2-1;j>=1;j--){
            if((i==n || i==1) || (j==n || j==1)){
                System.out.print(i);
            }else{
                System.out.print("");
            }
        }
        System.out.println();
       } 
    }
    
}