import java.util.*;
public class selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={2,6,4,7,9,1,6};
        select(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
    public static void select(int arr[]) {
        //int min=arr[0];
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        
    }
}