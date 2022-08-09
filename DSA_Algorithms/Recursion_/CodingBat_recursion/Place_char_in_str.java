package Recursion_.CodingBat_recursion;
//Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
//
//
//pairStar("hello") → "hel*lo"
//pairStar("xxyy") → "x*xy*y"
//pairStar("aaaa") → "a*a*a*a"

public class Place_char_in_str {

    public String pairStar(String str) {
        String s="";
        if(str.length()==0)return "";

        if(str.length()==1)return str.charAt(0)+"";

        if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0)+"*"+pairStar(str.substring(1));
        }else{
            s=s+str.charAt(0);
        }
        return s+pairStar(str.substring(1));
    }


}
