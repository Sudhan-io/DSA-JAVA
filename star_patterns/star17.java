import java.util.Scanner;
public class star17 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       
       for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        char ch='A';
        int bp=(2*i+1)/2;
        for(int k=1;k<=(2*i+1);k++){
            if(k<=bp){ System.out.print(ch);ch+=1;}
            else{
            System.out.print(ch);
            ch-=1;
        }
       }
        System.out.println();
       
      }
    }
}  
/*
   A
  ABA
 ABCBA
ABCDCBA

*/