package Bubble_sort;

public class Bubble_sort_1 {

    public static void main(String[] args) {
        int[] arr={2,4,1,5,6,3};
        int[] result=bubble_sort(arr);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    static int[] bubble_sort(int[] arr){
        int last_index= arr.length;
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<last_index;j++){
                if(arr[j-1]>arr[j]){
                    int a=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=a;
                    swapped=true;
                }
            }//for loop end
            if(!swapped)break;
            last_index--;
        }
        return arr;
    }
}
