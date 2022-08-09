public class Seperate_upper_lower {
    public static void main(String[] args) {
        seperate_upper_lower("HelLLo");

    }
    static void seperate_upper_lower(String s){
        String upper="";
        String lower="";
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                upper=upper+s.charAt(i);
            }
            if((int)s.charAt(i)>=98 && (int)s.charAt(i)<=122){
                lower=lower+s.charAt(i);
            }else continue;
        }
        System.out.println("Lower chars: "+lower);
        System.out.println("Upper chars: "+upper);

    }
}

