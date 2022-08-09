public class Shift_elements {
    public static void main(String[] args) {
        int[] arr={2,4,1,5,6,3};
        int[] result=shift_values(arr,3);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    static int[] shift_values(int [] arr,int shift_by){
        for(int i=0;i<shift_by;i++)
        {
            int temp=arr[0];
            for(int j=1;j< arr.length;j++)
            {
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }

        return arr;
    }
}
