class Buzz_num{
	public static void main(String[] args) {
		buzz(120);
	}

	static void buzz(int n){
		int rem=n%10;
		if(rem==7 || n%7==0){
			System.out.println(n+" is buzz num");
		}
		else{
			System.out.println(n+" Not buzz");
		}

	}
}