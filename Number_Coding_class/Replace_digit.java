class Replace_digit{
	public static void main(String[] args) {
		int num=220406;
		int a=num;
		int sum=0;
		int rem=0;
		int i=0;
		int o=10;
		while(num>0){
			rem=num%10;
			if(rem!=2){     // 2 will be removed from Number....
				if(i==0){
					sum=rem;
				}
				else{
					sum=sum+o*rem;
					o*=10;
				}	
			}
			else{
				sum=sum+o*5;
				o*=10;
			}
			
			num=num/10;
			i++;
		}
		System.out.println(a+"---------"+sum);
	}
}