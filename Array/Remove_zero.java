import java.util.Scanner;

class Remove_zero{
	public static void main(String[] args) {
		System.out.print("enetr size of array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];

		System.out.println("enter "+size+" elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int[] arr2=arr_after_removing_zero(arr);
		System.out.println();
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}
	static int[] arr_after_removing_zero(int[] arr){
		int count=0;
		for (int i=0;i<arr.length ;i++ ) {
			if(arr[i]==0){
				count++;
			}
		}
		int[] new_arr=new int[arr.length-count];
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				new_arr[k]=arr[i];
				k++;
			}
		}
		return new_arr;
	}
}
