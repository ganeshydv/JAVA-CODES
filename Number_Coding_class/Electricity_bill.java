class Electricity_bill{
	public static void main(String[] args) {
		count_bill(220);
	}
	static void count_bill(int n){
		int sum=0;
		int x=n;
		// System.out.println(n);
		while (n>0) {
			// System.out.println(n);
			if(n<=100){
				sum=0;
				break;
			}
			// n=n-100;

		    if(x>100 && x<=200){
		    	n=n-100;
			    sum=n*5;
			    System.out.println(sum);
			    
		    }
		    if(x>200){
		    	n=n-100;
		    	sum=n*5;
		    	
		    	System.out.println(sum);
		    	break;
		    }

		}
		// System.out.println(sum);
		
	}
}