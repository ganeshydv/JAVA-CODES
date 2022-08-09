class Pyramad{
	public static void main(String[] args) {
		int n=5;
		int k=n;
		int l=1;
		for(int i=0;i<n;i++){
			for(int a=1;a<k;a++){
				System.out.print(" ");
			}
			for(int b=0;b<l;b++){
				System.out.print(" ");
				System.out.print("*");
			}
			k--;
			l++;
			System.out.println();
		}
	}
}