import java.util.Scanner;

public class seperate_digits {
    public static void main(String[] args) {
        System.out.print("enetr element: ");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        int[] arr=seperate(element);
        System.out.println("seperate digits are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static int[] seperate(int num){
        int n=num;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        int[] arr=new int[count];
        int i=0;
        int rem=num;
        while(count>0){
            int div=rem/(int)(Math.pow(10,count-1));
            rem=num%(int)(Math.pow(10,count-1));
            count--;
//            num=num/10;
            arr[i]=div;
            i++;
        }
        return arr;
    }
}
