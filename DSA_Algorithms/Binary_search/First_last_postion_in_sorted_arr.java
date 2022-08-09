package Binary_search;

import java.util.Arrays;

public class First_last_postion_in_sorted_arr {
    public static void main(String[] args) {
        int[] arr={2,4,4,4,4,4,4,6,7,8};
        System.out.println(Arrays.toString(find_1at_last_index_postion(arr,4)));
    }
    static int[] find_1at_last_index_postion(int[] arr,int target){
        int floor=target-1;
        int ceiling=target+1;
        int[] index_arr=new int[2];
        int start=0;
        boolean b=false;
        int end=arr.length-1;
        int end_index=0;
        //find ceiling
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==ceiling){
                end_index=mid;
                b=true;
                break;
            }else if(arr[mid]>ceiling){
                end=mid-1;
            }else start=mid+1;
        }
        if(b){
            index_arr[1]=end_index-1;
        }else {
            index_arr[1]=end;
        }

        // find floor
        int start2=0;
        int end2=index_arr[1];
        int floor_index=0;
        b=false;
        while (start2<=end2){
            int mid=start2+(end2-start2)/2;
            if(arr[mid]==floor){
                floor_index=mid;
                b=true;
                break;
            }else if(arr[mid]>floor){
                end2=mid-1;
            }else start2=mid+1;
        }
        if(b){
            index_arr[0]=floor_index+1;
        }else{
            index_arr[0]=start2;
        }

        return index_arr;
    }
}
