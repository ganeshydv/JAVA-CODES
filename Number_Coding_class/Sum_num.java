class Sum_num{
	public static void main(String[] args) {
		int x=sum_of_num(1393);
		System.out.println(x);

	}
	static int sum_of_num(int n){
		int sum=0;
		int rem=0;
		while(n>0){
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}
}