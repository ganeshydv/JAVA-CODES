package Recursion_;

public class Factorial_ {
    public static void main(String[] args) {
        System.out.println(fact_using_recursion(5));
    }
    static  int fact_using_recursion(int n){
        if(n==1) return 1;
        return n*fact_using_recursion(n-1);
    }
}
