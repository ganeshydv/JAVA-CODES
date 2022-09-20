public class OccuranceOfChar {
    public static void main(String[] args) {
        String s="welcome";
        contChars(s);
//        char[] charArr=new char[s.length()];
//
//        for(int i=0;i<s.length();i++){
//            charArr[i]=s.charAt(i);
//        }
//
//        for(int i=0;i<charArr.length;i++){
//            int count=1;
//            char c1=charArr[i];
//            for(int j=i+1;j<charArr.length;j++){
//                if(c1==charArr[j]){
//                    count++;
//                    charArr[j]=0;
//                }
//            }
//            if(charArr[i]!=0){
//                System.out.println(c1+" "+count);
//            }
//        }
    }//main end
    static void contChars(String s){
        for(int i=0;i<s.length();i++){
            int count =0;
            char c=s.charAt(i);
            for(int k=0;k<s.length();k++){
                if(s.charAt(i)!='0' && s.charAt(k)==s.charAt(i) ){
                    count++;
                    s.replace(s.charAt(k),'0');
                }
            }
            System.out.println(c+" "+count);
        }
    }
}
