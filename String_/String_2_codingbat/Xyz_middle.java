public class Xyz_middle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AxyzBBB"));
    }
    static boolean xyzMiddle(String str) {
        int len=str.length();
        int left=0;
        int right=0;
        for(int i=0;len>2 && i<len-3;i++){
            if(str.substring(i,i+3).equals("xyz")){
                left=i;
                right=len-i-3;
            }
        }
        if(len>2 && Math.abs(left-right)<=1)return true;
        return false;
    }
}
