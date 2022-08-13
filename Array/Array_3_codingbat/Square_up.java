
// Given n>=0, create an array length n*n with the following pattern,
// shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


// squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
// squareUp(2) → [0, 1, 2, 1]
// squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]


public class Square_up {
    public static void main(String[] args) {
        int[] a=squareUp(3);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static int[] squareUp(int n) {

        int[] nums=new int[n*n];
        int k=n-1;//for zeros
        int val=1;
        int i=0;
//        for(int i=0;i<n*n;i++)
        while(i<(n*n)-1)
        {
            for(int j=0;j<k;j++) // for zeros
            {
                nums[i]=0;
                if(i+1<nums.length)i++;

            }
            k--;
            int val_2=val;
            for(int j=val;j>=1;j--)  //
            {
                nums[i]=val_2;
                val_2--;
                if(i+1<nums.length)i++;
            }
//            i--;
            val++;
        }

        return nums;
    }


}
