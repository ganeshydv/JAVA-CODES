class Fib{

	public static void main(String[] args) {
		fib(20);
	}

	public static void fib(int n) {
		
		int x=0;
		int y=0;
		int sum=0;

		for(int i=0;i<=n;i++)
		{
			if(i<=1)
			{
				sum =i;
				System.out.println(sum);
			    y=sum;
		    }
		    else 
		    {
		    	sum =x+y;
				System.out.println(sum);
				x=y;
			    y=sum;
		    }
		    
		}
		
	}
	

}