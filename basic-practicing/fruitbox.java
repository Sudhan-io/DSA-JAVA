import java.util.*;
public class fruitbox {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int apple=sc.nextInt();
        int orange=sc.nextInt();
        int banana=sc.nextInt();

        int box_cap=8;
        int total=0;
        int last_box_rem=0;
        total=(int) Math.ceil(((float)(apple+orange+banana)/8));
        if((apple+orange+banana)%8!=0){
            last_box_rem=box_cap-((apple+orange+banana)%8);
        }else{
            last_box_rem=0;
        }
        System.out.println(total);
        System.out.println(last_box_rem);
    }
}