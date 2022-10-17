import java.util.ArrayList;
import java.util.Arrays;

public class Binary_num {
    public static void main(String[] args) {
        System.out.println(bin_format(7,3));
    }
    static int bin_format(int num,int y){
        int n=num*y;
        int bin_num=0;
        ArrayList<Integer> lst=new ArrayList<>();
        int ten=0;
        while (n>0){
            int rem=n%2;
            lst.add(0,rem);
//            bin_num=bin_num+rem*(int)Math.pow(10,ten);ten++; or below without built in method
            bin_num=bin_num+rem*ten;
            ten=ten*10;
            n=n/2;
        }
        int count_1s=0;
        for(int i=0;i<lst.size();i++){
            if(lst.get(i)==1){
                count_1s++;
            }
        }
        System.out.println(Arrays.toString(lst.toArray()));
        return count_1s;
    }
}
