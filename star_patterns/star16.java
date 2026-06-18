import java.util.Scanner;
public class star16 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       char ch='A';
       for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){

            System.out.print(ch);
            
        }ch+=1;
        System.out.println();
       }
    }
}  
/*
A
BB
CCC
DDDD
EEEEE

*/