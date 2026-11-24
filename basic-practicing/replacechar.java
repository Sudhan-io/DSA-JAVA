// import java.util.*;
// public class replacechar {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s=sc.nextLine();
//         char oldchar=sc.nextLine().charAt(0);
//         char newchar=sc.nextLine().charAt(0);
//         System.out.println(s.replace(oldchar,newchar));
//     }
// }

import java.util.*;
public class replacechar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char oldchar=sc.nextLine().charAt(0);
        char newchar=sc.nextLine().charAt(0);
        String st="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==oldchar) st+=newchar;
            else st+=s.charAt(i);
        }
        System.out.println(st);
    }
}
