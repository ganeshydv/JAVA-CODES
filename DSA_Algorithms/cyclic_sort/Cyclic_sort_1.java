package cyclic_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cyclic_sort_1 {
    public static void main(String[] args) {
        int[] arr={2,4,1,5,6,3};
//        cyclic_sort(arr);
        Cyclic_sort_1 ref1=new Cyclic_sort_1();
        ref1.cyclic_sort_2(arr);
        System.out.println(Arrays.toString(arr));
    }

     void cyclic_sort_2(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct_index=arr[i]-1;
            if(arr[i]!=arr[correct_index]){
                int temp=arr[i];
                arr[i]=arr[correct_index];
                arr[correct_index]=temp;
            }else i++;
        }
    }
    //my code...........
    static void cyclic_sort(int[] arr){
        int i=0;
        while(i< arr.length){
            if(arr[i]-1!=i){
                int correct_index=arr[i]-1; //right index position for element...4
                int temp=arr[correct_index]; //take value of targeted position
                arr[correct_index]=arr[i]; //put value at targated position
                arr[i]=temp;     //put value taken from targeted position to current position
                i=-1;
            }
            i++;
        }
    }
}
