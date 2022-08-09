//1)if String contains no repeated char then anagram
//2) if two stings are equal then anagram

public class Anagram_ {
    public static void main(String[] args) {
        System.out.println(check_anagram("doog"));
    }
    static boolean check_anagram(String s){
//        char[] char_arr=new char[arr.length];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for (int j=i+1;j<s.length();j++) {
                if(c==s.charAt(j)) return false;
            }
        }
        return true;
    }
}
