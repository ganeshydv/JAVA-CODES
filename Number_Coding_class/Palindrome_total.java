class Palindrome_total{
	public static void main(String[] args) {
		count_palidrome(200);
	}
	static void count_palidrome(int n){
		int rev=0;
		// int num=n;
		int count=0;
		int rem=0;
		for(int i=101;i<n;i++){
			int j=i;
			while(j>0){
				rem=j%10;
				rev=rev*10+rem;
				j=j/10;
			}
			if(rev==i){
				count++;
				System.out.println(i);
			}
			rev=0;
		}
		System.out.println(count);
	}
}