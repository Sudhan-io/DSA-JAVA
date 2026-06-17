import java.util.Scanner;
public class star13 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int c=1;
       for(int i=1;i<n+1;i++){
        for(int j=1;j<i+1;j++){
            System.out.print(c+" ");
            c+=1;
        }
        System.out.println();
       }
    }
}   
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/