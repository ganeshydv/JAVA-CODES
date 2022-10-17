package SoftS;

import java.util.Scanner;

public class PrimeNumSub {
    public static void main(String[] args) {
        String s="";
        for(int i=2;i<1000;i++){
            boolean b=true;
            for(int j=2;j<=i/2;j++){

                if(i%j==0){
                    b=false;
                    break;
                }
            }
            if(b){
                s+=i;
            }
        }
//        System.out.println(s);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter index:");
        int a=sc.nextInt();
        System.out.println(s.substring(a,a+5));
    }
}
