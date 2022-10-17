class Spy_num{
	// spy num = sum of digit=product digit
	public static void main(String[] args) {
		spy_num_check(122);
	}
	static void spy_num_check(int n){
		int sum=0;
		int product=1;
		int x=n;
		while(n>0){
			int rem=n%10;
			n=n/10;
			product*=rem;
			sum+=rem;
		}
		if(sum==product){
			System.out.println(x+" is spy num");
		}else{
			System.out.println(x+" is not spy num");
		}
	}
}