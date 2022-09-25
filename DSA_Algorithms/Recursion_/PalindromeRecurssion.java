package recurssion;

public class PalindromeRecurssion {

	public static void main(String[] args) {
		System.out.println(CheckPalindrome("abba"));
		
	}
	static boolean CheckPalindrome(String str) {
		if(str.length()==1 || str.length()==0) return true;
		if(str.charAt(0)!=str.charAt(str.length()-1))
			return false;
		return CheckPalindrome(str.substring(1,str.length()-1));
		
	}

}
