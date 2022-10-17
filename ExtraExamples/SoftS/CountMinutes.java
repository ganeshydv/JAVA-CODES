package SoftS;

import java.util.Arrays;
import java.util.Scanner;

public class CountMinutes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int row=sc.nextInt();
        System.out.println("enter number of columns: ");
        int col=sc.nextInt();
//        int[][] arr=new int[row][col];
        int[][] arr={{2,1,1},{0,1,1},{1,1,2}};
//        for(int r=0;r<row;r++){
//            System.out.print("Enter "+r+" elements: ");
//            for(int c=0;c<col;c++){
//                arr[r][c]=sc.nextInt();
//            }
//        }
        for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        int minutes=0;
        for(int r=0;r<row;r++){

            for(int c=0;c<col;c++){
                if(arr[r][c]==2){
                    boolean b=false;
                    if(c-1>=0 && arr[r][c-1]==1 ){
                        arr[r][c-1]=2;
                        b=true;
                    }
                    if(c+1<arr[r].length && arr[r][c+1]==1){
                        arr[r][c+1]=2;
                        b=true;
                    }
                    if(r-1>=0 && arr[r-1][c]==1){
                        arr[r-1][c]=2;
                        b=true;
                    }
                    if(r+1<arr[r].length && arr[r+1][c]==1){
                        arr[r+1][c]=2;
                        b=true;
                    }
                    if(b){
                        minutes++;
                    }

                }//if

            }//inner for
        }// outer for
        System.out.println(minutes);
        for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        boolean b=false;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(arr[r][c]==1){
                    b=true;
                }
            }
        }
        if(!b){
            System.out.println("minutes: "+minutes);
        }else{
            System.out.println("minutes: "+(-1));
        }

    }//main


}
