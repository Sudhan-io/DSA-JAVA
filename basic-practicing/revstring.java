import java.util.*;

public class revstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char[] s= new char[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next().charAt(0);
        }
        revstr(s);
        sc.close();
    }

    public static void revstr(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(s));
    }
}