public class sameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("hellohel"));
    }
    static String sameEnds(String str) {
        int len=1;
        String s="";
        for(int i=0;i<str.length()/2;i++){
//            for(int k=str.length()-1;k>str.length()/2;k--){

//                if(str.charAt(i)==str.charAt(k)){
//                    len++;
//                    s=s+str.charAt(i);
//                }
                if(str.substring(0,len).equals(str.substring(str.length()-len))){
                    s="";
                    s=s+str.substring(0,len);
                }
                len++;
//            }//inner for end
        }
        return s;
    }

}
