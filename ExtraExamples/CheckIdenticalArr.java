public class CheckIdenticalArr {
    public static void main(String[] args) {
        int[] arr1={1,2,4,5};
        int[] arr2={1,2,4,5};
        boolean b=false;
        if(arr2.length!=arr1.length){
            System.out.println("not identical");
        }else {
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    b=false;
                    break;
                }
                b=true;
            }
        }
        if(b){
            System.out.println("identical");
        }else {
            System.out.println("not identical");
        }
    }
}
