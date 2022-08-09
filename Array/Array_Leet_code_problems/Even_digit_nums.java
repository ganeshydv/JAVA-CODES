package Array_Leet_code_problems;

public class Even_digit_nums {

    static int findNumbers(int[] nums) {

        int even_digit_nums=0;
        for(int col=0;col<nums.length;col++)
        {
            int count_digits=0;
            int n=nums[col];
            while(n>0){
                count_digits++;
                n=n/10;
            }
            if(count_digits>1 && count_digits%2==0){
                even_digit_nums++;
            }
        }
        return even_digit_nums;


    }//end of method

    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        int n=findNumbers(arr);
        System.out.println(n);
    }
}
