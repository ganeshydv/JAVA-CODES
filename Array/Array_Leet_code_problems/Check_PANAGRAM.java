package Array_Leet_code_problems.__leet_with_q;
//problem

//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//
//
//Example 1:
//
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
//Example 2:
//
//Input: sentence = "leetcode"
//Output: false
//
//
//Constraints:
//
//1 <= sentence.length <= 1000
//sentence consists of lowercase English letters.
public class Check_PANAGRAM {
    public boolean checkIfPangram(String sentence) {
        int count=0;
        for(int i=97;i<=122;i++){
            for(int k=0;k<sentence.length();k++){
                int a=sentence.charAt(k);
                if(i==a){
                    count++;
                    break;
                }
            }
        }
        if(count==26){
            return true;
        }
        return false;
    }
}
