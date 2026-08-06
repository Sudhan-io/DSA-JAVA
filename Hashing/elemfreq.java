import java.util.*;
public class elemfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        elemfreq fr=new elemfreq();
        fr.freq(arr,n);
        sc.close();
    }

    public void freq(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            System.err.println(entry.getKey()+" "+entry.getValue());
        }
    }
}