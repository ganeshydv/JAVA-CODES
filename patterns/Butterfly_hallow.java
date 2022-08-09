class Butterfly_hallow{
	
	public static void main(String[] args) {
		int n=5;
		int a=n*2;
		for (int i=1;i<=2*n; i++) {

			for(int j=1;j<=2*n;j++){
				if( i==j || j==1 || j==n*2 || j==a ){
				    System.out.print("*");

			    }else{
			    	System.out.print(" ");
			    }
			}
			a--;
			System.out.println();
		}
			
	}
}