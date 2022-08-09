import java.util.Scanner;

class Array_max_element{
	public static void main(String[] args) {
		System.out.println("Enetr size of array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter elements: ");
		int[] arr=new int[size];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=sc.nextInt();
		}
		int max=max_num(arr);
		System.out.println("max element is : "+max);
	}
	static int max_num(int[] arr){
		int maximum=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>maximum){
				maximum=arr[i];
			}
		}
		return maximum;
	}
}