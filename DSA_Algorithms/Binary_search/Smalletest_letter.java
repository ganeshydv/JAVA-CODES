class Smalletest_letter{

	public static void main(String[] args) {
		char[] arr={'a','c','f','g'};
		find_smallest_(arr,'b');

	}
	protected static void find_smallest_(char[] arr,char target){
		int start=0;
		int end=arr.length-1;
		int middle=0;
		while(start<=end){ //agar = nahi doge aur elemnt 0 aur 1st k bich hoga to output wrong hoga

			middle=start+(end-start)/2;

			if(arr[middle]==target){
				System.out.println("found element at index : "+middle);
				System.out.println("Smalletest_letter but greater than "+target+" is "+arr[middle+1]);
				break;
			}
			if(arr[arr.length-1]<target){
				System.out.println("not found");
				break;
			}
			if(arr[middle]<target){
				start=middle+1;
			}
			if(arr[middle]>target){
				end=middle-1;
			}
			
		}
		if(arr[arr.length-1]<target){
			System.out.println("Smalletest_letter but greater 1 than "+target+" is "+arr[0]);
	
		}else{
			if(arr[middle]!=target){
				System.out.println("Smalletest_letter but greater than "+target+" is "+arr[start]);
			}
			// System.out.println("Smalletest_letter but greater than "+target+" is "+arr[middle+1]);
			 //this is wrong kyoon ki element milega to wahi se index lena nahi mila
			 // to ceiling -->start aur floor hoga--> end
		}
		}
}