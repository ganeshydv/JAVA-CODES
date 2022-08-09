package Array_Leet_code_problems;

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
