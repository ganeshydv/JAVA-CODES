public class Cat_dog {
    public static void main(String[] args) {
        String s="catxxdogxxxdog";
//        System.out.println(s.substring(0));
        System.out.println(catDog(s));
    }
    static boolean catDog(String str) {
        int count_1=0;
        int count_2=0;
        for(int i=0;i<str.length()-2;i++)
        {
            String a=str.substring(i,i+3);
            if(a.equals("cat"))
            {
                count_1++;
//                i=i+2;
            }
            if(a.equals("dog")){
                count_2++;
//                i=i+2;
            }

        }
        if(count_1==count_2)
        {
            return true;

        }
        return false;

    }
}
