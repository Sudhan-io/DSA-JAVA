import java.util.*;
public class rowcolsum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        if(r!=c){
            System.out.println("No");
            return;
        }
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=sc.nextInt();
        int target=0;
        for(int j=0;j<c;j++) target+=a[0][j];
        boolean same=true;
        for(int i=0;i<r;i++){
            int rsum=0,csum=0;
            for(int j=0;j<c;j++){
                rsum+=a[i][j];
                csum+=a[j][i];
            }
            if(rsum!=target||csum!=target){
                same=false;
                break;
            }
        }
        System.out.println(same?"Yes":"No");
    }
}
