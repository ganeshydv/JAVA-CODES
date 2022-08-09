import java.util.Scanner;

class Sum_of_element{
	public static void main(String[] args) {
		System.out.print("enetr size of array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];

		System.out.println("enter "+size+" elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int sum_=sum(arr);
		System.out.println("sum of elements:" +sum_);

	}
	static int sum(int[] arr){
		int sum=0;
		for (int i=0;i<arr.length ;i++ ) {
			sum=sum+arr[i];
		}
		return sum;
	}
}