package Array_3_codingbat;
//Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
//
//
//linearIn([1, 2, 4, 6], [2, 4]) → true
//linearIn([1, 2, 4, 6], [2, 3, 4]) → false
//linearIn([1, 2, 4, 4, 6], [2, 4]) → true

public class Check_num_of_arr1_present_in_arr2_linear {
    public boolean linearIn(int[] outer, int[] inner) {
        int k=0;
        for(int i=0;i<inner.length;i++)
        {
            for(int j=0;j<outer.length;j++)
            {
                if(inner[i]==outer[j] ){
                    k++;
                    break;
                }
            }
        }
        if(k==inner.length) return true;
        return false;
    }

}
