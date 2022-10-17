import java.util.ArrayList;
import java.util.Arrays;

public class Check_sum_ {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int count=0;
//        ArrayList<int[]> lst=new ArrayList<>();
        for(int i=a;i<b;i++){
            boolean b_cond=false;
            for(int j=i;j<b;j++)
            {
                int sum=i+j;
                if(sum%8==0 || sum%14==0){
                    int[] arr={i,j};
//                    lst.add(arr);
                    count++;
                    b_cond=true;
                    i=j;
                }
                if(b_cond)break;
            }
        }
        System.out.println(count);
//        System.out.println("elements are:");
//        for (int[] obj:lst){
//            System.out.print(Arrays.toString(obj));
//        }
    }
}
