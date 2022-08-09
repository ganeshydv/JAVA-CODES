import java.util.*;

class Armstrong_num{
	public static void main(String[] args) {
		check_armstrong(153);
	}
	static void check_armstrong(int num){
		int sum=0;
		int rem=0;
		int n=num;
		int num2=num;
		int total_digits=0;
		// int count=0;
		while(n>0){
			total_digits++;
			n=n/10;
		}
		while(num>0){
			rem=num%10;
			sum=sum+(int)Math.pow(rem,total_digits); 
			num=num/10;
		}
		if(num2==sum){
			System.out.println(sum+ " is armstrong number");
		}
	}
}