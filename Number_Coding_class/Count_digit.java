class Count_digit{
	public static void main(String[] args) {
		// int num=220406;
		count_digits(2);
		check(20,1);
		
	}
	static void count_digits(int num){
		int i=0;
		for(int p=1;p<25;p++){
			int rem=0;
			int z=p;
			while(z>1){
			    rem=z%10;
			    if(rem==num){   
				    i++;
			    }
			
			    z=z/10;
			}
		}
		
		System.out.println("count of digit 2 --> "+i);

	}

public static void check(int num,int key) {
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(i%10==key)
		{
			count++;
		}
		if(i/10==key)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
