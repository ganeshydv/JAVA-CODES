package Recursion_.CodingBat_recursion;
//Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
//
//
//changePi("xpix") → "x3.14x"
//changePi("pipi") → "3.143.14"
//changePi("pip") → "3.14p"

public class Replace_pi {
    public String changePi(String str) {
        String s="";
        if(str.length()==0)return "";
        int k=1;
        if(str.length()>=2 && str.substring(0,2).equals("pi")){
            s=s+3.14;
            k=2;
        }else{
            s=s+str.charAt(0);
        }
        return s+changePi(str.substring(k));
    }

}
