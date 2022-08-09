package Scanner_class;
import java.util.Scanner;
public class String_io {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        double d=sc.nextDouble();
        String str;
        System.out.println("string");
        str = sc.nextLine();
//         StringBuilder str=new StringBuilder();
//         str.append(sc.next());
//         String s2=str.toString();
        sc.close();

        System.out.println("String: "+str);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
    }
}
