public class Count_word_end_tz {
    public static void main(String[] args) {
        System.out.println(countYZ("day yak"));
    }
    static int countYZ(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if((str.charAt(i)=='z' ||str.charAt(i)=='y') && (int)str.charAt(i+1)==' ' )
            {
                count++;
                i++;
            }else
            if((str.charAt(i)=='z' ||str.charAt(i)=='y') && (int)str.charAt(i+1)<65 ){
                count++;
                i++;
            } else
            if((str.charAt(i)=='z' ||str.charAt(i)=='y') && (str.charAt(i+1)>91 && str.charAt(i+1)<97)){
                count++;
                i++;
            }else
            if((str.charAt(i)=='z' ||str.charAt(i)=='y') && str.charAt(i+1)>122){
                count++;
                i++;
            }
        }
        if(str.charAt(str.length()-1)=='z' ||str.charAt(str.length()-1)=='y'){
            count++;
        }
        return count;
    }

}
