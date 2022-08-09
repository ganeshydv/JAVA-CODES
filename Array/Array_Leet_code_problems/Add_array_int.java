package Array_Leet_code_problems;

import java.util.ArrayList;
import java.util.List;
public class Add_array_int {

    public static void main(String[] args) {
        int [] num={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
//        [1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3]
//516
        int num_1=516;
        int k=num_1;
        int count=0;

        while(num_1>0){ //for counting total digits in k
            count++;
            num_1=num_1/10;
        }
        int len=num.length;
        int[] arr=new int[count+1];
        int index=count;
        for(int i=len-1;i>len-2-count;i--)//started from rigt
        {
            arr[index]=num[i]; //saved from right to left
            index--;

        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum*10+arr[i];
        }

//        System.out.println(sum);
        sum=sum+k;
//        System.out.println(sum);
        int index_2= arr.length-1;
        while(sum>0){
            int rem=sum%10;
            arr[index_2]=rem;
            index_2--;
            sum=sum/10;
        }
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        index= arr.length-1;
        for(int i=len-1;i>len-2-count;i--)//started from rigt
        {
            num[i]=arr[index]; //saved from right to left
            index--;

        }
        for(int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }



























//        int ten=10;
        //[9,9,9,9,9,9,9,9,9,9]
//        //1
//        for(int i=0;i<num.length;i++)
//        {
//            sum=sum*10+num[i];
//
//        }
//        long n=sum+1;
//        List<Integer> lst=new ArrayList<>();
//        while(n>0){
//            long rem=n%10;
//            lst.add(0,(int)rem);
//            n=n/10;
//        }
//        System.out.println(sum+1);
    }
}
