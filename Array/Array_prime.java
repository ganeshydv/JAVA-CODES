import java.util.Scanner;

class Array_prime{
	public static void main(String[] args) {
		System.out.print("enetr size of array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];

		System.out.println("enter "+size+" elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		check_prime(arr);
	}
	static void check_prime(int[] arr){
		System.out.println("prime elements are: ");
		for(int i=0;i<arr.length;i++){
			int count=0;
			for (int k=2;k<=arr[i]/2 ;k++ ) {
				// (arr[i]==1)?(break):(continue);
				if(arr[i]==1){
					break;
				}else
				if(arr[i]%k==0)
				{
					count++;
			    }else {
					break;
				}
		    }
			if(count==0){
				System.out.print(arr[i]+" ");
			}
		}
			

	}
}