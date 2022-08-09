public class sumNum {
    public static void main(String[] args) {
        System.out.println(sumNumbers("a22bbb3"));
    }
    static int sumNumbers(String str) {
        int sum=0;
        int n=0;
        for(int i=0;i<str.length();i++ ){

            if(Character.isDigit(str.charAt(i))){
                int start=i;   //start index of int
                i++;
                int end=i;     //end index for substring
                while(i<str.length() && Character.isDigit(str.charAt(i)) ){ //check next element is int if true
                    i++;
                    if(i<str.length() && Character.isDigit(str.charAt(i))){
                        i++;
                    }else break;
                    // end=i;
                }
                end=i;
                if(end>str.length())end--;
                sum=sum+Integer.parseInt(str.substring(start,end));
            }

        }
        return sum;
    }

}
