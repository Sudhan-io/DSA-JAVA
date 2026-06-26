import java.util.*;
public class isarmstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dup=n;
        int c=0;
        int sum=0;
    while(n>0){
        c+=1;
        n/=10;
    }    
    n=dup;
    while(n>0){
        sum+=Math.pow(n%10,c);
        n/=10;
    }
    if(dup==sum)System.out.println(true);
   else{ System.out.print(false);}
}
}
/*
Algorithm
Calculate the number of digits in the input number and store it in k.
Initialise a variable sum to 0. This variable will store the sum of each digit raised to the power of number of digits in number.
Make a copy of the original number to store it in a temporary variable.
Run a while loop with the condition n>0 and at each iteration:
Get the last digit of n by using the modulus operator % with 10 and store it in a temporary variable ld.
Add the digit ld raised to the power of k of the sum.
Update n by integer division with 10 effectively removing the last digit.
After the loop, check if the original input number is equal to the sum of the digits raised to the power of the number of digits in the number.
If they are equal, return true indicating the number is an Armstrong number.
If they are not equal, return false indicating that the number is not an Armstrong number.
 */