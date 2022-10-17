class Even_odd{
	public static void main(String[] args) {
		int num=21;
		int i=0;
		int a=0;
		while(num>1){
			i++;
			num=num-2;
		}

		if(num==0||num==2){
			// System.out.println();
			System.out.println("even "+i);
		}else{
			System.out.println("odd "+i);
		}

		//-----------best code------------
		if(num/2*2==num){
			// System.out.println();
			System.out.println("even ");
		}else{
			System.out.println("odd ");
		}
	}
}