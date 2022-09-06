package Connstructor_chaining;

public class A {
    int a;
    int b;
    A(int a){
        this.a=a;
    }
    A(int a,int b){
        this(a);
        this.b=b;
    }
}
class B extends A{
    int c;
    B(int a,int b,int c){
        super(a,b);
        this.c=c;
    }
}
