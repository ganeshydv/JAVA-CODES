class ArmstrongNumber{
	public static void main(String[] args) {
		System.out.println("3 Digit ArmstrongNumber");
		boolean result= checkArmostrong(153);
		System.out.println(result);
	}
	static boolean checkArmostrong(int n){
		int original=n;
		int sum=0;
		while(n>0){
			int reminder=n%10;  //reminder..
			sum=sum+reminder*reminder*reminder; // for 3 digit number
			n=n/10;          
		}
		return original==sum;
	}
}