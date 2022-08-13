package Array_3_codingbat;
//
////
//Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
// (spaces added to show the grouping).
// Note that the length of the array will be 1 + 2 + 3 ... + n,
// which is known to sum to exactly n*(n + 1)/2.
//
//
//        seriesUp(3) → [1, 1, 2, 1, 2, 3]
//        seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
//        seriesUp(2) → [1, 1, 2]
public class create_array_1_12_123_so_on_seriesUp {
    public int[] seriesUp(int n) {
        int[] arr=new int[n*(n+1)/2];
        int val=1;
        int i=0;
        if(arr.length==1){
            arr[0]=1;
            return arr;
        }
        while(i<arr.length-1)
        {
            for(int k=1;k<=val;k++)
            {
                arr[i]=k;
                if(i+1<arr.length)i++;
            }
            val++;
        }
        return arr;
    }

}
