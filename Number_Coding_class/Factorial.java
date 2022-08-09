class Factorial{
	public static void main(String[] args) {
		
		System.out.println(fact(6));
		System.out.println(fact_2(6));
	}

	final static int fact(int n){
		int sum=1;
		for(int i=1;i<=n;i++){
			sum=sum*i;
		}
		return sum;
	}
	final static int fact_2(int n){
		int sum=1;
		int i=1;
		while(i<=n){
			sum*=i;
			i++;
		}
		return sum;
	}
}