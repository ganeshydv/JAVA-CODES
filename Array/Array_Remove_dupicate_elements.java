import java.util.Scanner;

class Array_Remove_dupicate_elements{
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
		int[] arr={1,2,3,2,4,5,3,6,1};
		System.out.println("before removing duplicated values: ");
		prnt_arr(arr,arr.length);
		int[] arr_after_removing_duplicated=remove_duplicate(arr);
		System.out.println();
		System.out.println("after removing duplicated values: ");
		prnt_arr(arr_after_removing_duplicated,arr_after_removing_duplicated.length);
	}
	static void prnt_arr(int[] arr,int len){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	static int[] remove_duplicate(int[] arr){
		System.out.println();
		System.out.println("removing duplicated values.......");
		int count=0;

		//check how many duplicated elements and 
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){   // check if element is repeated or not
					if(arr[j]!=0){
						count++; //count before replaceing with zero
					} 
					arr[j]=0;   //if duplicate replace

				}
				else arr[i]=arr[i]; // if not duplicate put as it is..
			}
		}

		int[] arr_new=new int[arr.length-count];  // new array of length after substracting total duplicated count..
		prnt_arr(arr,arr.length);
		int m=0;
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]!=0){                    //check arr[k] is zero if not then.. 
			    arr_new[m]=arr[k];            //add element to new array....
			    m++;
			}
			
		}
		return arr_new;
	}

	
}