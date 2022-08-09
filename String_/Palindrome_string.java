public class Palindrome_string {
    public static void main(String[] args) {
        System.out.println(check_palindrome_str("hello"));
        System.out.println(check_palindrome_str("abcdcba"));
    }
    static boolean check_palindrome_str(String str){
        int k=str.length()-1;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(k)){
                return false;
            }
            k--;
        }
        return true;
    }
}
