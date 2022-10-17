package JspExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrReplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length: ");
        int a=sc.nextInt();

        int[] arr = new int[a];
        int[] arr2 = new int[a];
        
        System.out.println("enter elements: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        arr[a-1]=-1;
        for(int i=0;i<arr.length-1;i++){
            int nextMax=arr2[i+1];
            boolean b=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr2[i]<arr2[j])
                {
                    if(nextMax>arr2[j]){
                        nextMax=arr2[j];
                    }
                    b=true;
                }
            }//
            if(b){
                arr[i]=nextMax;
            }else{
                arr[i]=-1;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
