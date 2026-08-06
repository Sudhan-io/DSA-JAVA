import java.util.*;
public class highlowfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        highlowfreq hl=new highlowfreq();
        hl.hlfreq(nums);
        sc.close();
    }
    public void hlfreq(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxfr=0,minfr=nums.length;
        int maxel=0,minel=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int el=entry.getKey();
            int c=entry.getValue();
            if(c>maxfr){
                maxfr=c;
                maxel=el;
            }else if(c<minfr){
                minfr=c;
                minel=el;
            }
        }
        System.out.println("the element with most occurrences : "+maxel);
        System.out.println("the elemnet with least occurrences : "+minel);
    }
}
/*
7
1 1 1 1 3 4 3
op:

the element with most occurrences : 1
the elemnet with least occurrences : 4

*/