import java.util.Scanner;

class Array_element_freq_count{
	public static void main(String[] args) {
		System.out.println("Enetr size of array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter elements: ");
		int[] arr=new int[size];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter key: ");
		int key=sc.nextInt();
		System.out.println("frequency is: "+count_frq_of_num(arr,key));
	}
	static int count_frq_of_num(int[] arr,int key){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				count++;
			}

		}
		return count;
	}
}