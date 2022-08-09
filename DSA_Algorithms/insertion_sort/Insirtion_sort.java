package insertion_sort;

import java.util.Arrays;

public class Insirtion_sort {
    public static void main(String[] args) {
        int[] arr={2,4,1,5,6,3};
//        insertion_sort_2(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(insertion_sort_(arr)));
    }
    static void insertion_sort_2(int[] arr){
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];//min
                    arr[j]=arr[j-1];//swap max with greater index
                    arr[j-1]=temp;//set min
                }else break;
            }
        }
    }
    //below code is not working properly...
    static int[] insertion_sort_(int[] arr){
        for(int i=1;i<arr.length-1;i++)
        {
            for(int j=0;j<i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        return  arr;
    }
}
