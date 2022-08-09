package Array_Leet_code_problems;

import java.util.Arrays;

public class Max_population_year {
    public static void main(String[] args) {
//        int[][] logs={{2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}};
//        [[2033,2034],[2039,2047],[1998,2042],[2047,2048],[2025,2029],
//        [2005,2044],[1990,1992],[1952,1956],[1984,2014]]....1.....
//        [[1950,1961],[1960,1971],[1970,1981]]......2.....
//        [[2025,2041],[1988,2007],[2003,2046],[2045,2049],[
//        2025,2027],[2014,2040],[2014,2027],[2011,2027],[1972,2019]]....3.....
//        [[2008,2026],[2004,2008],[2034,2035],[1999,2050],[2049,2050],[2011,2035],[1966,2033],[2044,2049]]....4...
//        int[][] logs={{2025,2041},{1988,2007},{2003,2046},{2045,2049},{2025,2027},{2014,2040},{2014,2027},{2011,2027},{2011,2027},{1972,2019}};
        int[][] logs={{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049}};
        for (int i=0;i< logs.length;i++){
            System.out.print(Arrays.toString(logs[i]));
        }
        System.out.println();
        System.out.println(maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
//        int[][] logs=new int[logs_2.length][2];
        //sort array-insertion sort
        for(int i=1;i<logs.length-1;i++){
            for (int sub_arr=i+1;sub_arr>0;sub_arr--){
                if(logs[sub_arr][0]<logs[sub_arr-1][0]){
                    int[] temp=logs[sub_arr];
                    logs[sub_arr]=logs[sub_arr-1];
                    logs[sub_arr-1]=temp;
                }
            }

        }
        for (int i=0;i<logs.length;i++){
            System.out.print(Arrays.toString(logs[i]));
        }
        int alive=1;
        int dead=0;
        int[][] arr=new int[logs.length][2];
        arr[0][0]=1;//alive
        arr[0][1]=0;//dead
        int[] total_alive=new int[logs.length];
        total_alive[0]=1;
        for(int row=1;row<logs.length;row++){

            arr[row][0]=++alive;
            for(int row2=0;row2<=row;row2++){
                if(logs[row2][1]<logs[row][0]){
                    dead++;
                    arr[row][1]=dead;
                }else{
                    arr[row][1]=dead;
                }
            }
            total_alive[row]=arr[row][0]-arr[row][1];
//            total_alive[row]=alive-dead;
            dead=0;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(Arrays.toString(arr[i]));
        }
        System.out.println();
        System.out.println(Arrays.toString(total_alive));
        //find max
        int max=1;
        for (int i: total_alive) {
            if(max<i){
                max=i;
            }
        }
        int index=0;
        for(int i=0;i<total_alive.length;i++){
            if(max==total_alive[i]){
                index=i;
                break;
            }
        }
        return logs[index][0];
    }
}
