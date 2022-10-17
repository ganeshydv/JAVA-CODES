import java.util.ArrayList;
import java.util.Arrays;

public class Calulate_1s_in_bin {
    public static void main(String[] args) {
        System.out.println(bin_format(12,7));
    }
    static int bin_format(int num,int y){
        int n=num*y;
        int count_1s=0;
        int ten=0;
        while (n>0){
            int rem=n%2;
            if(rem==1){
                count_1s++;
            }
            n=n/2;
        }


        return count_1s;
    }
}
