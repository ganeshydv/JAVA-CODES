class Array_iter{
	public static void main(String[] args) {
		int[] arr={-4,-3,-2,-1,4,3,2};
		System.out.println(largestAltitude(arr));
	}
	static int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        int count=0;
        for(int i=0;i<gain.length;i++){
            arr[i+1]=arr[i]+gain[i];
        }
        for(int i=0;i<arr.length-1;i++){
            for(int k=0;k<arr.length;k++){
                
                if(arr[i]>arr[k]){
                    count=arr[i];
                }else{
                    count=arr[k];
                }
                
            }
        }
        return count;
    }
}