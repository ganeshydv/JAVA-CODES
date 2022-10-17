public class find_max_div_by_3_in_range {
    public static void main(String[] args) {
        int[] arr={-6,-91,1011,84,-22,0,1,473};
        System.out.println(find_max_by_3(arr));
    }
    static int find_max_by_3(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0 && max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
