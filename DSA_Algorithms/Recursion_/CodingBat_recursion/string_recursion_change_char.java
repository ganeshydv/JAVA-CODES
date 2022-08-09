package Recursion_.CodingBat_recursion;
//Given a string, compute recursively (no loops)
// a new string where all the lowercase 'x' chars have been changed to 'y' chars.
//
//
//changeXY("codex") → "codey"
//changeXY("xxhixx") → "yyhiyy"
//changeXY("xhixhix") → "yhiyhiy"

public class string_recursion_change_char {
    public String changeXY(String str) {

        if(str.length()==0) return "";
        char c=str.charAt(0);
        String s="";
        if(c=='x'){
            s=s+'y';
        }else{
            s=s+c;
        }
        return s+ changeXY(str.substring(1) );
    }

}
