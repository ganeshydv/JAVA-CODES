public class CombineArr {
    public static void main(String[] args) {
        int[] arr1={1,2,4,5};
        int[] arr2={1,2,4,5};

        int[] newArr=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            boolean b=true;

            for(int j=0;j< newArr.length;j++){
                if(newArr[j]==arr1[i]){
                    b=false;
                    break;
                }
            }
            if(b){
                newArr[i]=arr1[i];
            }
        }
    }
}
