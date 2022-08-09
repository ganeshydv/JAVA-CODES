class Palindrome{
	public static void main(String[] args) {
		Palindrome_(1221);
	}
	static void Palindrome_(int n){
		int rem=0;
		int rev=0;
		int num2=n;
		while(n>0){
			rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
		if(num2==rev){
			System.out.println(num2+"...palindrome..."+rev);
		}else{
			System.out.println(num2+"...not palindrome..."+rev);
		}

	}
}
