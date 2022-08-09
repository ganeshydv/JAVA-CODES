import java.util.Arrays;

public class Seperate_num_char {
    public static void main(String[] args) {
        seperate_char_nums("12sjbkjbk2112");
    }
    static void seperate_char_nums(String s){
        int a=0;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=98 && s.charAt(i)<=122)){
                str=str+s.charAt(i);
            }
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                a=a*10+Character.getNumericValue(s.charAt(i));
            }
        }
//        Arrays.
//        String x="";
//        x.
        System.out.println("chars are:"+str);
        System.out.println("ints are :"+a);

    }//method end
}//class end
