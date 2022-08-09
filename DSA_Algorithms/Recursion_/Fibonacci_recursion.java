package Recursion_;

public class Fibonacci_recursion {
    public static void main(String[] args) {
        System.out.println(fib_recursion(0,1,1));
    }
    static int fib_recursion(int a,int b,int n){
        int sum=a+b;
        a=b;
        b=sum;
        if(n==10)return sum;
        System.out.print(sum+" ");
        return fib_recursion(a,b,n+1);
    }
}
