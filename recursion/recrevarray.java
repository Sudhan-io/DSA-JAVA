import java.util.*;

public class recrevarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //sc.nextLine();
        //String s=sc.nextLine();
        revarr(arr,0,n-1);
        for(int each: arr){
        System.out.print(each+" ");
    }
    }
public  static void revarr(int arr[],int left,int right){
    if(left>=right){
        return;
    } 
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    revarr(arr,++left,--right);
    
    
}
}
/*
5
1 2 3 4 5
op:5 4 3 2 1 
*/