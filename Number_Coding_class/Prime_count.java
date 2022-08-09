class Prime_count{
	public static void main(String[] args) {
		prime_count(50);
	}
	static void prime_count(int n){
		int count=0;
		for(int i=2;i<n;i++){
			if(check_prime(i)){
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(count);
	}
	static boolean check_prime(int num){
		int n=2;
		while(n<=num/2){
			if(num==2 ||num==3){
				return true;
			}
			if(num%n==0){
				return false;
			}
			n++;
		}
		return true;
	}
}