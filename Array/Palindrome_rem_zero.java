class Palindrome_rem_zero{
	public static void main(String[] args) {
		int num_after_rem_zero=remove_zero(20102);
		check_palindrome(num_after_rem_zero);

	}

	static int remove_zero(int n){
		int n2=n;
		int sum=0;
		while(n2>0){
			int rem=n2%10;
			if(rem!=0){
				sum=sum*10+rem;
			}
			n2=n2/10;
		}
		// System.out.println(sum);
		return sum;
	}
	static void check_palindrome(int num){

		int n=num;
		int rev=0;
		int rem=0;
		while(n>0){
			rem=n%10;
			rev=rev*10+rem;

			n=n/10;

		}
		System.out.println("num: "+num+"rev "+rev);
		if(num==rev){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}
}