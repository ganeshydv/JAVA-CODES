class PrimeCheck{

	public static void main(String[] args) {

		boolean check =isPrime(2);
		System.out.println(check);

		boolean check_2 =isPrime_2(2);
		System.out.println(check_2);

		boolean check_3 =isPrime_3(2);
		System.out.println(check_3);
	}
	static boolean isPrime(int num){
		int c=1;
		while(c*c<num){  //c<num/2
			c++;
			if(num%c==0){
				return false;
			}else return true;
			
		}
		return num==c*c;
	}
	static boolean isPrime_2(int num){
		int i;
		for(i=2;i<num/2;i++){
			if(num%i==0){
				return false;
				// break;  //no use of break after return...
			}
		}
	return true;
	}

	static boolean isPrime_3(int num){
		int x=0;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				x=1;
				break;
			}
			else{
				x=2;
			}
		}
		if(x==2){
			return true;
		}else {
			return false;
		}
	}
}