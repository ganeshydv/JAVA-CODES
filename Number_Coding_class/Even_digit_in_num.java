class Even_digit_in_num{
	public static void main(String[] args) {
		int x=digits_even(12446);
		System.out.println(x);
		System.out.println(digits_by_3(1333));
	}
	static int digits_even(int n){
		int i=0;
		int rem=0;
		while(n>0){
			rem=n%10;
			n=n/10;
			if(rem%2==0){
				i++;
			}
		}
		return i;
	}
	static int digits_by_3(int n){
		int i=0;
		int rem=0;
		while(n>0){
			rem=n%10;
			n=n/10;
			if(rem%3==0){
				i++;
			}
		}
		return i;
	}
}