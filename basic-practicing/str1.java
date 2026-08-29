import java.util.*;
public class str1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int e1=sc.nextInt();
        int e2=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String st=sc.nextLine();
        if(s.substring(s1,e1).equals(st.substring(s2,e2))){
            System.out.print(s.substring(s1,e1).length());
        }
    }
}