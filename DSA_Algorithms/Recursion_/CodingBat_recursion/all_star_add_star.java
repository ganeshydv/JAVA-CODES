package Recursion_.CodingBat_recursion_new_rec;
//
//Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
//
//
//        allStar("hello") → "h*e*l*l*o"
//        allStar("abc") → "a*b*c"
//        allStar("ab") → "a*b"
public class all_star_add_star {
    public String allStar(String str) {
        if(str.length()==0)return "" ;
        if(str.length()==1)return ""+str.charAt(0) ;
        String s=""+str.charAt(0)+"*";
        return s+allStar(str.substring(1));
    }

}
