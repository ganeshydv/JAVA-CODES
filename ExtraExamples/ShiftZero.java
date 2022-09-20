import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftZero {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,0,1,0,0,1,1};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j-1]==1 && arr[j]==0){
                    arr[j]=1;
                    arr[j-1]=0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
