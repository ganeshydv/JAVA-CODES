class Lucky_num{
	public static void main(String[] args) {
		check_power_num(22);
	}
	//if last 2 digit sum <10 then...
	static void check_power_num(int n){
		int z=n;
		int sum=0;
		while(n>0){
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		int k=0;
		while(sum>0){
			int rem=sum%10;
			k=k+rem;
			sum=sum/10;
		}
		if(k==4){
			System.out.println(z+" is lucky number");
		}else{
			System.out.println(z+" is not lucky number");
		}

	}
}