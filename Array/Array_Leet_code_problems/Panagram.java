
class Panagram{
	public static void main(String[] args) {
		boolean b=checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
		if(b){
			System.out.println("Panagram");
		}else System.out.println("not Panagram");
	}
	static boolean checkIfPangram(String sentence) {
        int count=0;
        for(int i=97;i<=122;i++){
            for(int k=0;k<sentence.length();k++){
                int a=sentence.charAt(k);
                if(i==a){
                    count++;
                    break;
                }
            }
        }
        if(count==26){
            return true;
        }
        return false;
    }
}