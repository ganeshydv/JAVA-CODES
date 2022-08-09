public class Bread_ {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
    }
    static String getSandwich(String str) {
        int start =0;
        int end=0;
        boolean b1=false;
        boolean b2=false;
        for(int i=0;str.length()>5 && i<str.length();i++)
        {
            if(i+5<str.length() && str.substring(i,i+5).equals("bread"))
            {
                start=i+5;
                i=i+5;
                b1=true;
                for(int j=str.length();j>i;j--)
                {
                    if(str.substring(j-5,j).equals("bread"))
                    {
                        end=j-5;
                        b2=true;
                        j=j-5;
                        break;
                    }
                }
                if(b2) break;
            }

        }//outer for loop end
        if(b1 && b2)return str.substring(start,end);
        return "";

    }

}
