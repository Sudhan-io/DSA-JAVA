import java.util.*;
 class digitsofno{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            n/=10;
            c+=1;
        }
        System.out.println(c);
    }
 }
 /*
 
 if input is 123456
 itll be divided by 10 until it becomes 0
 hence here the no of time the input gets divided equals the total no digits
 so op will be 6
 */