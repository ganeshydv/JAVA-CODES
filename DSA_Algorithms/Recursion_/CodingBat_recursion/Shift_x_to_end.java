package Recursion_.CodingBat_recursion;

//
//Given a string, compute recursively a new string where
// all the lowercase 'x' chars have been moved to the end of the string.

//        endX("xxre") → "rexx"
//        endX("xxhixx") → "hixxxx"
//        endX("xhixhix") → "hihixxx"

public class Shift_x_to_end {
    public String endX(String str) {

        if(str.length()==0 )return "";
        String s="";
        if(str.charAt(0)=='x'){
            return endX(str.substring(1))+"x";
        }else{
            s=""+str.charAt(0);
        }
        return s+endX(str.substring(1));
    }

}
