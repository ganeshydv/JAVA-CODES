public class DistinctElement {
    public static void main(String[] args) {
        String s="welcome";
        String s1="";
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int k=0;k<s.length();k++){
                if(i!=k && s.charAt(i)==s.charAt(k)){
                    count=1;
                }
            }
            if(count==0)
            {
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
