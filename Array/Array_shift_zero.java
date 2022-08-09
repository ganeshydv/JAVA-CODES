import java.util.Scanner;

class Array_shift_zero{
	// System.out.println();
	public static void main(String[] args) {
//		System.out.println("Enetr size of array: ");
//		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		System.out.println("Enter elements: ");
//		int[] arr=new int[size];
//		for (int i=0;i<arr.length ;i++ ) {
//			arr[i]=sc.nextInt();
//		}
		int[] arr={1,0,0,0,3,0,4,0,3,6,1};
		System.out.println("before shifing Zeros: ");
		prnt_arr(arr,arr.length);
		int[] arr_after_shift=shift_zero(arr);
		// System.out.println();
		// System.out.println("after removing duplicated values: ");
		// prnt_arr(arr_after_shift,arr_after_shift.length);
	}
	static void prnt_arr(int[] arr,int len){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	static int[] shift_zero(int[] arr){
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){   //check arr[i] is zero or not if not zero shift it
				arr[index]=arr[i]; 
				index++;
			}
		}
		for(int i=index;i<arr.length;i++){
			arr[i]=0;
		}

		System.out.println();
		System.out.println("after shifting Zeros: ");
		prnt_arr(arr,arr.length);
		return arr;
	}

	
}

