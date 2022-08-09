class Array_odd_even_position{
	public static void main(String[] args) {
		// System.out.print("enetr size of array: ");
		// Scanner sc=new Scanner(System.in);
		// int size=sc.nextInt();
		// int[] arr=new int[size];

		// System.out.println("enter "+size+" elements:");
		// for(int i=0;i<arr.length;i++){
		// 	arr[i]=sc.nextInt();
		// }
		int[] arr={0,1,2,3,4,5,6,7,8,9,10};
		int[][] arr_2d= print_elements(arr);
		for(int i=0;i<arr_2d.length;i++){
			if (i==0) {
				System.out.print("elements at even position: ");
				for(int a:arr_2d[i]){
				    System.out.print(a+" ");
			    }
			}
			System.out.println();
			if (i==1) {
				System.out.print("elements at odd position: ");
				for(int a:arr_2d[i]){
				    System.out.print(a+" ");
			    }
			}
			
		}
	}

	static int[][] print_elements(int[] arr){
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even++;
			}else odd++;
		}
		int[] even_arr=new int[even];
		int[] odd_arr=new int[odd];
		int x=0,y=0;
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				even_arr[x]=arr[i];
				x++;
			}else {
				odd_arr[y]=arr[i];
				y++;
			}
		}

		int[][] even_odd= new int[2][];
		even_odd[0]=new int[even_arr.length];
		even_odd[1]=new int[odd_arr.length];
		for(int k=0;k<even_arr.length;k++){
			even_odd[0][k]=even_arr[k];
		}
		for(int k=0;k<odd_arr.length;k++){
			even_odd[1][k]=odd_arr[k];
		}
		return even_odd;
	}
}