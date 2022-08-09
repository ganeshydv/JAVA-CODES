package Recursion_;

//divide and conquer .............


public class Binary_search_ {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(bin_search_recursion(arr,0,arr.length-1,11));
        System.out.println(bin_search_recursion_2(arr,0,arr.length-1,11));
    }
    static int bin_search_recursion(int[] arr,int start,int end,int target){
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target)return mid;
        if(target>arr[mid]){
            return bin_search_recursion(arr,mid+1,end,target);
        }
        return bin_search_recursion(arr,start,end-1,target);
    }
    static int bin_search_recursion_2(int[] arr,int start,int end,int target){
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target)return mid;
        if(target>arr[mid]){
            start=mid+1;
        }
        if(target<arr[mid]){
            end=mid-1;
        }
        return bin_search_recursion_2(arr,start,end,target);
    }
}
