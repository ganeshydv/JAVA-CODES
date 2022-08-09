import java.util.Scanner;

public class Array_io {
    public static void main(String[] args) {

        int[] arr2=input_();
        reverse_array(arr2);
    }
    static int[] input_(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("elements are: ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
        return  arr;

    }

    static void reverse_array(int[] arr){
        int[] a=new int[arr.length];
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            a[count]=arr[i];
            count++;
        }
        System.out.println();
        System.out.println("reverse array: ");;
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        int sum=0;
        int product=1;
        for(int i=arr.length-1;i>=0;i--){
            sum=sum+arr[i];
            product=product*arr[i];
//            count++;
        }
        System.out.println("sum: " +sum);
        System.out.println("product: "+product);



    }
}
