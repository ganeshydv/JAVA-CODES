package JspExam;

import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int num=sc.nextInt();
        int totalDigits=1;
        int n=num;
        int original=num;
        while (n>10){
            totalDigits=totalDigits*10;
            n=n/10;
        }
        if(checkCircularPrime(num,totalDigits)){
            System.out.println(original+" ----> Circular prime");
        }else {
            System.out.println(original+" ----> not Circular prime");
        }
    }
    static boolean checkCircularPrime(int num,int totalDigits){
        int original=num;
        while (checkPrime(num)){
            int rem=num%10;
            num=num/10+rem*totalDigits;
            if(num==original){
                return true;
            }
        }
        return false;
    }
    static boolean checkPrime(int n){
        if(n==2 || n==3)return true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}

