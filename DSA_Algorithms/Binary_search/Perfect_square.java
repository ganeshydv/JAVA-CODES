package Binary_search;

public class Perfect_square {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
    }
    static boolean isPerfectSquare(int num) {
        if(num==1)return true;
        int start=1;
        int end=num/2;
        while(start<=end){
            float mid=start+(end-start)/2;
            if(mid==num/mid){
                return true;
            }else if(mid<num/mid){
                start=(int)mid+1;
            }else{
                end=(int)mid-1;
            }
        }//while end
        return false;
    }
    //----------------- another solution ----------------
    public boolean isPerfectSquare(double num) {
        double sq=Math.pow(num,0.5);
        if(num%sq==0)
            return true;
        return false;
    }
}
