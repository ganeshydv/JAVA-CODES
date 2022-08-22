package ExceptionHandling_try_catch_.Throw_CustomExcption;

public class Checked_CustomException1 {
    public static void main(String[] args) {
        String s="Happiness is key to success .........";
        if(s.contains("IS")){
            System.out.println("word is present in the given string");
        }else {
            try {
                throw new WordNotFoundException();
            }catch (WordNotFoundException w){
                w.disp();
            }
        }
    }
}
////needed to be handled before Execution of code ....compiler forces to handle it
class WordNotFoundException extends Exception{
    void disp(){
        System.out.println("given word is not present in String.....");
    }
}