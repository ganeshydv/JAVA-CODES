//package coding_bat_array_2;

public class Sum67 {

    public static void main(String[] args) {
        int[] arr={1, 6, 2, 2, 7, 1, 6, 99, 99, 7};       //2
        int[] arr2={1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};   //2
        int[] arr3={6, 7, 1, 6, 7, 7};                    //8
        int[] arr4= {1, 2, 2};                            //5
        int s=sum67(arr);
        System.out.println(s);
        int s2=sum67(arr2);
        System.out.println(s2);
        int s3=sum67(arr3);
        System.out.println(s3);
        int s4=sum67(arr4);
        System.out.println(s4);
    }
    static int sum67(int[] nums) {
        int sum=0;
        int p_6=0;  //for updating position index
        for(int i=0;i<nums.length;i++){
            // below p_6 is new index position for each call of index_position()
            //method in for loop..........it is updated below in if condition
            int[] index_position=index_position(nums,p_6);  //find index of 6 and 7

            //below check condition is for
            //1)to exclude elements between 6 and 7
            //2) to update index i of for loop --> to index of element 7's position
            //3)update p_6 which is index for starting search in method index_position(nums,p_6)--> to index of element 7's position why?
            //because when you call index_position(nums,p_6) it must start searching array from end of last search position
            //a(means from there -----where last search was ended) rather than starting from index 0;

            if(i>=index_position[0] && i<index_position[1]){
                i=index_position[1];
                p_6=index_position[1];
                continue;
            }else{

                sum=sum+nums[i];

            }


        }
        return sum;


    }
    static int[] index_position(int[] nums,int p_6){
        int[] index_arr=new int[2];
        for(int i=p_6;i<nums.length;i++){
            if(nums[i]==6){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==7){
                        index_arr[0]=i;
                        index_arr[1]=j;
                        break;
                    }
                }
                break;
            }
        }
        return index_arr;

    }/////////e
}

