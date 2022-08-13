package Array_Leet_code_problems.__leet_with_q;
//problem

//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//
//To flip an image horizontally means that each row of the image is reversed.
//
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//For example, inverting [0,1,1] results in [1,0,0].
//Example 1:
//
//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
//Example 2:
//
//Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
//Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//
//
//Constraints:
//
//n == image.length
//n == image[i].length
//1 <= n <= 20
//images[i][j] is either 0 or 1.
public class Flipping_img {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}}; //  ---->  [[0,1,1],[1,0,1],[0,0,0]]  ------>  [[1,0,0],[0,1,0],[1,1,1]]
        int[][] arr2= flipAndInvertImage(arr);
//        display(arr2);
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {

            //-------img reverse----------
            int index2=image[i].length-1;
            for(int j=0;j<(image[i].length)/2;j++)
            {
                int a=image[i][index2];//last element
                int b=image[i][j];
                image[i][index2]=b;
                image[i][j]=a;
                index2--;//decreasing element position
            }
//                display(image);
            //------img invert----------
            for(int j=0;j<image[i].length;j++)
            {
                if(image[i][j]==1){
                    image[i][j]=0;
                }else if(image[i][j]==0){
                    image[i][j]=1;
                }

            }
            display(image);
        }
        return image;
    }
    static void display(int[][] arr2){
        System.out.print("[ ");
        for(int i=0;i<arr2.length;i++){
            System.out.print("[");
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+",");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.print(" ]");
        System.out.println();

    }
}
