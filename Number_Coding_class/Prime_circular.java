class Prime_circular{
	public static void main(String[] args) {
		boolean b=check_circular(192);
		if(b){//if b true 
			System.out.println("circular prime");
		}else{
			System.out.println("Not circular prime");
		}
	}
    static	boolean check_circular(int num){
		// int rem=0;
		int n=num;
		int num2=num;
		int count=0;
		int rev=0;
		while(n>0){
			count++;
			n=n/10;
		}

		//check prime function call hoga aur return true ya false hoga ..
		//jab true hoga tab while loop execute hoga aur false hoga to nahi hoga 
			
		while(check_prime(num)){ 
			int rem=num%10;
			int div=num/10;
			//ye number k digits ki position change karega....123-->312-->231-->123
			num=(int)Math.pow(10,count-1)*rem+div;
			
			//agar original number==number jo digit position change karne k 
			//baad aygea same hoge to function return karega TRUE warna 
			// while loop execute hota rahega tab tak jab tak condtion 
			//check_prime(num) function False nahi hota matlab num prime nahi hoga
			
			if(num2==num){
				return true;
			}

		}
		return false;
	}


   //niche wali method prime check karegi
	static boolean check_prime(int num){
		int n=3;
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