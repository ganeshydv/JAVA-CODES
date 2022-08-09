import java.util.Scanner;

class Odd_even_index{
	public static void main(String[] args) {
		System.out.println("enetr size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();

		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		find_num_at_even_index(arr);
		find_num_at_odd_index(arr);
	}

	
	static  void find_num_at_even_index(int[] arr){
		System.out.print("elements at even position: ");
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				System.out.print(arr[i]+" ");
			}
		}
	}
	static  void find_num_at_odd_index(int[] arr){
		System.out.print("elements at odd position: ");
		for(int i=0;i<arr.length;i++){
			if(i%2!=0){
				System.out.print(arr[i]+" ");
			}
		}
	}
}



