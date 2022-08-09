package Recursion_.CodingBat_recursion;
//
//Given a non-negative int n, return the count of the occurrences of 7 as a digit,
// so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
// while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
//
//        count7(717) → 2
//        count7(7) → 1
//        count7(123) → 0
public class Divide_conq_count_7 {
    public int count7(int n) {
        int rem=n%10;
        int c=0;
        if(rem==7){
            c++;
        }
        if(n<=0)return 0;
        return c+ count7(n/10);
    }

}
