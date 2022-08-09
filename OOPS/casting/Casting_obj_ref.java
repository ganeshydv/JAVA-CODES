package casting;

public class Casting_obj_ref {
    public static void main(String[] args) {
        demo1 d1= new demo2();
        demo2 d2=(demo2) d1;
        System.out.println(d1.hashCode());
        System.out.println(d1.x);
        System.out.println(d2.x);
        System.out.println(d2.y);
        int i=2;
//        do {
//            i++;
//        }while (i<1);

        while (i<1){
            i++;
        }
        System.out.println(i);
        int a=10;
        double d=33.33;
        //widening
        double x=a;
        //narrowing
        int y=(int) d;
    }
}
class demo1{
    int x=20;
}
class demo2 extends demo1{
    int y=10;
}
