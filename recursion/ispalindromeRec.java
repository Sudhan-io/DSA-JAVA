import java.util.*;

public class ispalindromeRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(ispalin(s,0,s.length()-1));
        
    }
public  static boolean ispalin(String s,int left,int right){
    if(left>=right){
        return true;
    }
    if(s.charAt(left)!=s.charAt(right)){
        return false;
    }
    
    return ispalin(s,++left,--right);
    //ispalin(s,++left,--right);B
    
    
}
}
/*
sono
op:false
*/