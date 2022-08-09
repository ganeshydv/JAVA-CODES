package Recursion_.CodingBat_recursion;
//
//Given a string, return recursively a "cleaned" string where adjacent chars
// that are the same have been reduced to a single char. So "yyzzza" yields "yza".
//
//
//        stringClean("yyzzza") → "yza"
//        stringClean("abbbcdd") → "abcd"
//        stringClean("Hello") → "Helo"
public class Remove_repeating_chars {
    public String stringClean(String str) {
        String s="";
        if(str.length()==1 )return ""+str.charAt(0);
        if(str.charAt(0)==str.charAt(1)){
            return stringClean(str.substring(1));
        }
        return str.charAt(0)+stringClean(str.substring(1));
    }


}
