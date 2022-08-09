public class Altitude_max {
    public static void main(String[] args) {
        int[] arr={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        // int count=gain[0];
        for(int i=0;i<gain.length;i++){
            arr[i+1]=arr[i]+gain[i];
        }
        int max=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }

            // for(int k=0;k<arr.length;k++){

            //     // if(arr[k]>arr[i]){
            //     //     if(count>arr[k]){
            //     //         count=count;
            //     //     }else{
            //     //     count=arr[k];
            //     //     }
            //     // }else{
            //     //     if(count>arr[i]){
            //     //         count=count;
            //     //     }else{
            //     //         count=arr[i];;
            //     //     }

            //     }

            // }
        }
        return max;
        // return count;
    }
}

