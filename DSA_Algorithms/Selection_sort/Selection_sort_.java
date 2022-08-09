package Selection_sort;

public class Selection_sort_ {
    public static void main(String[] args) {
        int[] arr={2,4,1,5,6,3};
        int[] result=selection_sort(arr);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    static int[] selection_sort(int[] arr){
        int last_index=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            boolean b=false;
            int max=arr[0];
            int index=0;
            for(int j=1;j<last_index;j++)
            {
              if(arr[j]>max){
                  max=arr[j];
                  index=j;
                  b=true;
              }
            }

            int temp=arr[last_index];
            arr[last_index]=max;
            arr[index]=temp;
            last_index--;
            if(!b)break;//if no element is swapped break loop
        }

        return arr;
    }
}
