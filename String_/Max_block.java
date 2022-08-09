public class Max_block {
    public int maxBlock(String str) {
        int count=1;
        int max=0;
        for(int i=1;i<str.length();i++){
            boolean b=false;
            while(i<str.length() && str.charAt(i)==str.charAt(i-1)){
                count++;
                b=true;
                i++;
            }
            if(b)i--;
            if(count>max){
                max=count;
            }
            count=0;
        }
        return max;
    }


}
