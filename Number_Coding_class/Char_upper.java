class Char_upper{
	public static void main(String[] args) {
		int a='z';
		System.out.println(a);  //65-90 ;97-122
		// char p=97;
		// System.out.println(p);

		// System.out.println(Char_('a'));
		// int[] arr2=new int[5];
		// int[] arr=new int[arr2.length];
		// System.out.println(arr.length);
		// for (int i=0;i<arr2.length ;i++ ) {
		// 	System.out.println(arr2[i]);
		// }b
		 // Char_('a');
	}
	static char Char_(char c)
	{
		int a=c;
		int x=a-32;
		char y=(char) x;

		System.out.println(y);
		return y;
	}
}


