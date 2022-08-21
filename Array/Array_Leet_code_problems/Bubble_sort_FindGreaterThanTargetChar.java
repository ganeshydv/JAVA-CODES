package Array_Leet_code_problems.New;

//Find Smallest Letter Greater Than Target
//Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
//
//Note that the letters wrap around.
//For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
//Example 1:
//
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Example 2:
//
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Example 3:
//
//Input: letters = ["c","f","j"], target = "d"
//Output: "f"
//
//
//Constraints:
//
//2 <= letters.length <= 104
//letters[i] is a lowercase English letter.
//letters is sorted in non-decreasing order.
//letters contains at least two different characters.
//target is a lowercase English letter.

public class Bubble_sort_FindGreaterThanTargetChar {
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int start=0;
            int end=letters.length;
            if(target<letters[0] || target>=letters[end-1])return letters[0];

            while(start<=end){
                int mid=start+(end-start)/2;
                // int mid=start+end>>1;
                if(letters[mid]==target){
                    if(mid+1<letters.length){
                        while(letters[mid]==letters[mid+1]){
                            mid++;
                        }
                        return letters[mid+1];
                    }
                }else if(letters[mid]<target){
                    start=mid+1;
                }else end=mid-1;

            }
            return letters[start];
        }
    }
}
