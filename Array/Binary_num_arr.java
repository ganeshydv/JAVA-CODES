import java.util.ArrayList;

class Binary_num_arr{
	public static void main(String[] args) {
		binary_num_arrayList(125);
		System.out.println();
		binary_num(125);
	}
	static void binary_num_arrayList(int num){
		System.out.println("Using array list");
		ArrayList<Integer> lst =new ArrayList<>();
		int i=0;
		int count=0;
		while(num>0){
			int rem=num%2;
			lst.add(rem);
			i++;
			num=num/2;
			count++;
		}
		//1 2 4 8 16 32 64 
		// System.out.println(count);
		for(int k=count-1;k>=0;k--){
			System.out.print(lst.get(k)+" ");
		}
	}
	static void binary_num(int num){
		System.out.println("Using array");
		int n=num;
		int count=0;
		while(num>0){
			num=num/2;
			count++;
		}
		int[] arr=new int[count];
		int i=0;
		while(n>0){
			int rem=n%2;
			arr[i]=rem;
			i++;
			n=n/2;
			count++;
		}
		// System.out.println(count);
		for(int k=arr.length-1;k>=0;k--){
			System.out.print(arr[k]+" ");
		}

	}
}