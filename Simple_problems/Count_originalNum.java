public class Count_originalNum {
    public static void main(String[] args) {
        int a=10111;
        int n=a;
        int count=1;
        int sum=shiftNum(a);
        while(a!=sum){
            count++;
            sum=shiftNum(sum);
        }
        System.out.println(count);

    }
    static int count_digits(int num){
        int count=0;
        while (num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    static int shiftNum(int n){
        int a=n;
        int sum=0;
        int power=0;
        int firsDigit=0;
        while (a>0){
            if(a<10){
                firsDigit=a;
                break;
            }
            int rem=a%10;
            sum=sum+rem*(int) Math.pow(10,power);
            power++;
            a=a/10;
        }
        sum=sum*10+firsDigit;
        System.out.println(sum);
        return sum;
    }
}
