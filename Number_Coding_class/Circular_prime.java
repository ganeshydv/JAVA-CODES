import java.util.ArrayList;

class Circular_prime{
	int num;
	Circular_prime(int x){
		num=x;
	}

	public static void main(String[] args) {
		Circular_prime ref_var_1=new Circular_prime(17);
		boolean b=ref_var_1.check_prime(ref_var_1.num);
		if (b) {
			System.out.println("prime "+ref_var_1.num);
		}
		else{
			System.out.println("not prime "+ref_var_1.num);
		}
	}
	void check_circular_prime(int num){
		int n=num;
		int no_of_digits=0;
		ArrayList<Integer> lst=new ArrayList<>();
		while(n>0){
			int rem=n%10;
			lst.add(rem);
			n=n/10;
			no_of_digits++;
		}
		// int combination= SUMMATION  no_of_digits*(no_of_digits-1);
		int fact=1;
		int no_of_digits_2=no_of_digits;
		while(no_of_digits>1){
			fact=fact*no_of_digits;
			no_of_digits--;
		}
		int digit_times=fact/no_of_digits_2;//1 digit how many times at same position


		int comb_of_digit=digit_times/(no_of_digits_2-1); //1 digit how many times at same position other than 1st num

		for(int p=0;p<fact;p++){
		    int sum2=0;
		    for(int j=0;j<digit_times;j++){

		    }
		}


	}

//	int change_num(int num){
//		int x=num;
//
//	}

	boolean check_prime(int num){
		int a=num/2;
		while(a>1){

			if(num%a==0){
				return false;
			}
			a--;
		}
		return true;
	}
}