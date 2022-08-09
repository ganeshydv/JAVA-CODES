package Recursion_.CodingBat_recursion;
//
//Given a string, compute recursively (no loops) the number of "11" substrings in the string.
// The "11" substrings should not overlap.
//
//        count11("11abc11") → 2
//        count11("abc11x11x11") → 3
//        count11("111") → 1
public class count_11 {
    public int count11(String str) {

        if(str.length()<2)return 0;

        if(str.substring(0,2).equals("11")){
            return 1+count11(str.substring(2) );
        }
        return count11(str.substring(1));
    }

}
