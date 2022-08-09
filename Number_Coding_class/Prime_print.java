class Prime_print{
	public static void main(String[] args) {
		prime_count(20);
	}
	static void prime_count(int n){
		int count=0;
		for(int i=2;i<n;i++){
			
			for(int j=2;j<i;j++){

				
			}// 2 3 5 7 11 13 17 19 23 29 
			
		}
		System.out.println(count);
	}
	static boolean check_prime(int num){
		int n=3;
		while(n<num/2){
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