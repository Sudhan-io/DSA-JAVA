import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={2,6,5,7,9,1,6};
        insert(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
    public static void insert(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }
}