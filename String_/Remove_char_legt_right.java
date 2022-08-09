
public class Remove_char_legt_right {
    public static void main(String[] args) {
        String s="";
        String a="abcdesf";
        int start=0;
        int end=a.length();
        int k=0;
        while (start<end){
            for (int i=start;i<end;i++)
            {
                s=s+a.charAt(i);
            }
            System.out.println(s);
            if(k==0 || k%2==0) end--;// 0 1 2 3 4 5 6
            else start++;
            k++;
            s="";
        }
    }
}
