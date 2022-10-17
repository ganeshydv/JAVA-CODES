import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HashTag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of lines:");
        int lines=sc.nextInt();
        int[] count_arr=new int[lines];

        for(int k=0;k<count_arr.length;k++){
            int count=0;
//            String s="she is a good girl #johnmayer# #awesome##";
            System.out.println("enter line "+(1+k)+" :");
            String s=new String(sc.nextLine());
            ArrayList<String> str_lst=new ArrayList<>();
            for(int i=0;i<s.length();i++){
                String subStr="";
                while (i<s.length() && s.charAt(i)!=' '){
                    subStr+=s.charAt(i);
                    i++;
                }
                str_lst.add(subStr);
            }
            for(String s1:str_lst){
                System.out.println(s1);
            }
//            String[] str=s.split(" ");

//            sc.close(); //will give exception
            for(int i=0;i<str_lst.size();i++){
                boolean b=false;
                for(int j=1;str_lst.get(i).length()>1 && j <str_lst.get(i).length()-1;j++){
                    if(str_lst.get(i).charAt(j)=='#'){
                        b=true;
                    }
                }
                if(!b){
                    if(str_lst.get(i).length()>1 && str_lst.get(i).charAt(0)=='#' && str_lst.get(i).charAt(str_lst.get(i).length()-1)=='#'){
                        count++;
                    }

                }
                str_lst.remove(0);
                count_arr[k]=count;
            }
        }

        System.out.println(Arrays.toString(count_arr));
    }

}
