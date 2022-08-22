package Singleton_class;

//SINGLETON class - using A GETTER METHOD which returns OBJECT we can create ONLY ONE object of this class.......

public class Sun_singleton_ {
    private static Sun_singleton_ ref;
    public static Sun_singleton_ getSunSingleton(){
        if(ref ==null){
            ref=new Sun_singleton_();
        }
        return ref;
    }

    public static void main(String[] args) {
        Sun_singleton_ s1=new Sun_singleton_();
        Sun_singleton_ s2= new Sun_singleton_();
        System.out.println(s1==s2);
        Sun_singleton_ s3=getSunSingleton();
        Sun_singleton_ s4=getSunSingleton();
        System.out.println(s3==s4);
    }
}
