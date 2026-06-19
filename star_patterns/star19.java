import java.util.Scanner;
public class star19 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
        for(int j=0;j<(n)*2;j++){
            if(j<n-i || j>=((n-i)+(i*2)) ){
            System.out.print("*");}
            else{
                System.out.print(" ");
            }
        }System.out.println();
        
       }
       for(int i=n-1;i>=0;i--){
        for(int j=0;j<n*2;j++){
            if(j<n-i || j>=((n-i)+(i*2)) ){
            System.out.print("*");}
            else{
                System.out.print(" ");
            }
        }System.out.println();
        
       }
    }
}  