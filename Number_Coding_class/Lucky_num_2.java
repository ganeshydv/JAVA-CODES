class Lucky_num_2{
	public static void main(String[] args) {
		check_lucky_num();

	}
	static int sum_(int num){

		int n=num;
		int sum=0;

		while(n>0){
		    int rem=n%10;
			sum=sum+rem;
			n=n/10;
	    }
	    return sum;

	}
	static void check_lucky_num(){
		// int n=num;
		int sum=0;
		for(int N_=3000;N_<4000;N_++){
			int n=N_;
			while(n>0){
			    n=sum_(n);
			    // break;
			    if(n<10){
				    break;
			    }
			
		    }
		    if(n==1){
			    System.out.print(N_+" ");
		    }
		
		}
		
		// System.out.println(n);
	}
}