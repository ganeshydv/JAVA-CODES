class Replace_char{
	public static void main(String[] args) {
		String s="apple";
		String z="ok ans is :";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='p'){
				z=z+'k';
			}else{
				z=z+s.charAt(i);
			}
		}
		System.out.println(z);
	}
}