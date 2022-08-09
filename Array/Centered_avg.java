import java.util.Scanner;

class Centered_avg{
	public static void main(String[] args) {
		System.out.println("Enetr size of array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter elements: ");
		int[] arr=new int[size];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println(max_num_min(arr));

	}

	static int max_num_min(int[] arr){
		int maximum=arr[0];
		int min=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>maximum){
				maximum=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		int len=arr.length-2;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		sum=sum-maximum-min;
		int avg=sum/len;
		return avg;
	}
}