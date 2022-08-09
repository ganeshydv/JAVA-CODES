package Recursion_.CodingBat_recursion;
//
//Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
// except that an 8 with another 8 immediately to its left counts double,
// so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
// while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
//        count8(8) → 1
//        count8(818) → 2
//        count8(8818) → 4
public class Divide_conq_count_8_88 {
    public int count8(int n) {
        if(n<=0)return 0;  //base condition is always the known output or result...
        int rem=n%10;
        int c=0;
        if(rem==8){
            c++;
            if(n%100==88){
                c++;
            }
        }
        return c+count8(n/10);

    }

}
