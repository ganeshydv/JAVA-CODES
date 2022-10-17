class Reverse_digit{
	public static void main(String[] args) {
		int x=12345;
		System.out.println("num is :"+x);
		Reverse(x);
	}

	static void Reverse(int n){
		int rem=0;
		int num2=0;
		int i=1;
		int rev=0;
		while(n>0){

			rem=n%10;
			rev=10*rev+rem;
			n=n/10;

		}

		System.out.println("Revese num is: "+rev);
	}
}

//123 == 300 + 20 +1