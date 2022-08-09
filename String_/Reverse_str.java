class Reverse_str{
	public static void main(String[] args) {
		String str="hello";
		String empty="";
		for(int i =str.length()-1;i>=0;i--){
			empty=empty+str.charAt(i);
		}
		System.out.println(empty);

		StringBuilder sb=new StringBuilder("hello");   // String can not be used as its immutable so using string builder
//		String sb="hello";
		for(int i=0;i<sb.length()/2;i++){
			int init_half_index=i;
			int last_half_index=sb.length()-1-i;
			char c=sb.charAt(init_half_index);  //from start replaced
			char c2=sb.charAt(last_half_index);  //from end replaced
			sb.setCharAt(last_half_index,c);
			sb.setCharAt(init_half_index,c2);
		}
		System.out.println(sb);
	}
}