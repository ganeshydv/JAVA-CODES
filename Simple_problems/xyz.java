import java.util.Arrays;

public class xyz {
    public static void main(String[] args) {
        int[] A={22,34,4,5};
        xyz ref =new xyz();
        System.out.println(ref.find_score(A));
        System.out.println(Arrays.toString(A));
    }
     int find_score(int[] A){
        //sort_array
         xyz ref =new xyz();
        ref.sort(A);

        System.out.println(Arrays.toString(A));
        int[] score_arr=new int[A.length];
        int score=0;
        int min_score=0;
        for(int i=0;i< A.length;i++){
            int a_i=A[i];
            for(int x=1;x<=A[i];x++)
            {
                while (true)
                {
//                    a_i=a_i-min(a_i,x);
                    score=min(a_i,x);// 2nd step
                    a_i=a_i-score;
                    int greates_int=(int)0.1*a_i;
                    a_i=a_i-greates_int;// 3rd step
                    if(a_i==0)break;
                }//inner while
//                if((score)<=A[i]/2){
//                    score_arr[i]=score;
//                }
            }//inner for
            score_arr[i]=score;  //score for each index of i
            if(score_arr[i]<min_score)
            {
                min_score=score_arr[i];
            }
        }//outer for
        return -1;
    }
     void sort(int[] arr){
        int index=arr.length-1;
        for(int i=1;i< arr.length-1;i++){
            boolean isSorted=false;
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }else break;
            }
        }
    }
    static int min(int a1,int x){
        if(a1<x){
            return a1;
        }else return x;
    }
}
