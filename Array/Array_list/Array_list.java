import java.util.ArrayList;
import java.util.Scanner;


class Array_list{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	   ArrayList<Integer> list_of_array=new ArrayList<>();  //created 
	   for (int i=0;i<3 ;i++ ) {                    //initialized
	   	list_of_array.add(in.nextInt());
	   }
	   System.out.println(list_of_array);
	}
}