package JspExam;

import java.util.Arrays;

public class CountWord {
    public static void main(String[] args) {
        String s="hi guys all the best your test all the best bye";
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        String[] strArr=new String[count];
        int k=0;
        for(int i=0;i<s.length();i++){
            String s1="";
            while (i<s.length() && s.charAt(i)!=' '){
                s1=s1+s.charAt(i);
                i++;
            }
            if(k<strArr.length)strArr[k]=s1;
            k++;
        }
        System.out.println(Arrays.toString(strArr));
        for(int i=0;i< strArr.length;i++){
            int counter=1;
            for(int j=0;j< strArr.length;j++){
                if(i!=j && strArr[i].equals(strArr[j])){
                    counter++;
                    strArr[j]="0";
                }

            }
            if(!strArr[i].equals("0")){
                System.out.println(strArr[i]+" --> "+counter);
            }
        }
    }
}
