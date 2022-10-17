class Fact_of_digit{
	public static void main(String[] args) {
		System.out.println("STRONG NUBER ... checking..........");
		fact_of_digit_of_num(140);
		fact_of_digit_of_num(145);
	}
	static void fact_of_digit_of_num(int num){
		// int rem=n%10;
		int x=num;
		int sum=0;
		while(num>0){
			int rem=num%10;
			int factorial=fact(rem);
			sum=sum+factorial;
			num=num/10;
		}
		if(sum==x){
			System.out.print("sum of factorial of digits of "+x+" is: "+sum);
			System.out.println(" ----special num");
		}else{
			System.out.print("sum of factorial of digits of "+x+" is: "+sum);
			System.out.println(" ----not special");
		}
		

	}
	static int fact(int n){
		int fact=1;
		for(int j=1;j<=n;j++){
				fact=fact*j;
			}
		return fact;
	}

}