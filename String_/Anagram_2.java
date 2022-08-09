public class Anagram_2 {
    public static void main(String[] args) {
        System.out.println(check_anagram("doogo","giood"));
    }
    //code is wrong.....
    static boolean check_anagram(String s,String s2){
//        char[] char_arr=new char[arr.length];
        if(s.length()!=s2.length())return false;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for (int j=0;j<s2.length();j++) {
                boolean b=false;
                if(c==s2.charAt(j)) {
                    count++;
                    b=true;  //once found then we need to break further loop execution
                }
                if(b)break;
            }
        }
        if(count==s2.length())return true;
        return false;
    }
}
