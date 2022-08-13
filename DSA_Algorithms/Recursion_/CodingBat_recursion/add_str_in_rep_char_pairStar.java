package Recursion_.CodingBat_recursion_new_rec;
//
//pairStar("hello") → "hel*lo"
//        pairStar("xxyy") → "x*xy*y"
//        pairStar("aaaa") → "a*a*a*a"

public class add_str_in_rep_char_pairStar {
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
