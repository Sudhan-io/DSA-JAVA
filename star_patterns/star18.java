import java.util.Scanner;
public class star18 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
        char stc=(char) ('A'+n-1-i);
        for(char j=stc;j<=('A'+n-1);j++){
            System.out.print(j);
        }
       System.out.println();
    }}
}  
/*
E
DE
CDE
BCDE
ABCDE

*/