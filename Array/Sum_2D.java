public class Sum_2D {
    public static void main(String[] args) {
        int[][] io={{6,59,64,19,30,76,71,86,90,25,56,17,19,72,61,56,24,40,35,39,67,28,52,11,82,72,8,82,81,47}};
        int result=maximumWealth(io);
        System.out.println(result);
    }

    static int maximumWealth(int[][] accounts) {

        int a=0;
        int[] arr=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int x=0;
            for(int j=0;j<accounts[i].length;j++){
                x=x+accounts[i][j];

            }
            arr[i]=x;
        }

        for(int i=0;i<arr.length;i++){
            if(arr.length==1){
                a=arr[0];
                break;
            }
            if(arr[i]>arr[i+1]){
               a=arr[i];
               arr[i+1]=a;
            }else{
                a=arr[i+1];
            }
        }
        return a;
    }
}
