class Bin_search_1{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,9};
		binary_sr(a,8);
	}

	static void binary_sr(int[] arr,int n){
		int start_index=0;
		int end_index=arr.length-1;
		int middle_index=0;

		while(start_index<=end_index){
			//mid element find karne k liye niche k formula ko
			// use karne se data type ki range ki problem solve ho jayegi
			middle_index=start_index+(end_index-start_index)/2;
			if(arr[end_index]<n){
				System.out.println("out of range");
				break;
			}
			if(arr[middle_index]==n){
				System.out.println(n+"--> in  array at index:-> "+middle_index);
				break;
			}
			if(n>arr[middle_index]){
				start_index=middle_index+1;
			}
			if(n<arr[middle_index]){
				end_index=middle_index-1;
			}

			//if(arr[end_index]<n)
			//following is same as above if condition.....
			// if(start_index>end_index){
			// 	System.out.println("out of range");
			// 	break;
			// }
		}
		if(start_index!=end_index){
			
			System.out.println("output for ceiling case:"+arr[start_index]);
			System.out.println("output for floor case:"+arr[end_index]);
		}
	}
}