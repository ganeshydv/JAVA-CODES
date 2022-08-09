class Upper_lower{
	public static void main(String[] args) {
		check_upper_lower('a');
	}
	static void check_upper_lower(int a){
		if(a>=97 && a<=122){
			System.out.println("lower case Character");
		}
		if(a>=65 && a<=90){
			System.out.println("upper case Character");
		}
	}
}