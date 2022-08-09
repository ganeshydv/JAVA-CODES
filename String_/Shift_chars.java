public class Shift_chars {
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(shift_chars(s,3));
    }
    static String shift_chars(String s,int shift_by){
        if(shift_by>=s.length())return "enterd shift by is more than length";
        String s2="";
        for(int i=shift_by;i<s.length();i++){
            s2=s2+s.charAt(i);
        }
        for(int i=0;i<shift_by;i++){
            s2=s2+s.charAt(i);
        }
        return s2;
    }
    static String shift_chars_arr(String s,int shift_by){
        if(shift_by>=s.length())return "enterd shift by is more than length";
        char[] s2=new char[s.length()];

        for(int i=shift_by;i<s.length();i++){
//            s2=s2+s.charAt(i);
        }
        for(int i=0;i<shift_by;i++){
//            s2=s2+s.charAt(i);
        }
        return s;
    }
}
