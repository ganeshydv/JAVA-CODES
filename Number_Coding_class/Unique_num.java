class Unique_num{
	public static void main(String[] args) {
		check_unique(1223456);
	}
	static void check_unique(int num){
		int rem=0;
		int n=num;
		int count=0;
		int i=0;
		while(n>0){
			rem=n%10;

		    int m_=num;
		    int rem2=0;

			while(m_>0){
				rem2=m_%10;
				if(rem==rem2){
					count++;
				}
				m_=m_/10;
			}
			n=n/10;
			i++;
		}
		if(count==i){
			System.out.println(num+" Num is unique");
		}
		else{
			System.out.println(num+" is not unique");
		}

	}
}