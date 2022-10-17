package SharikSir;

public class SumOfNonPrime {
    static boolean checkPrime(int n){
//        if(n==0||n==1)return false;
        if(n==2 || n==3) return true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
//        System.out.println(checkPrime(1));
        int s=0;
        for(int i=0;i<10;i++){
            if(!checkPrime(i))s+=i;
        }
        System.out.println(s);
    }

}
