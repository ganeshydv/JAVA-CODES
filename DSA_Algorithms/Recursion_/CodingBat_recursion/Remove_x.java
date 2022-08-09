package Recursion_.CodingBat_recursion;
//
//Given a string, compute recursively a new string where all the 'x' chars have been removed.
//
//
//        noX("xaxb") → "ab"
//        noX("abc") → "abc"
//        noX("xx") → ""


public class Remove_x {
    public String noX(String str) {
        if(str.length()==0)return "";
        String s="";
        if(str.charAt(0)=='x'){

        }else{
            s=s+str.charAt(0);
        }
        return s+noX(str.substring(1));
    }

}
