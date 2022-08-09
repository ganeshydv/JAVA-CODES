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
