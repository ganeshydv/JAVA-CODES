package ExceptionHandling_try_catch_.Throw_CustomExcption;
//CUSTOM EXCEPTION
public class Unchecked_CustomException1 {
    public static void main(String[] args) {
        String s="Happy new year ....";
        if(s.contains("New")){
            System.out.println("word found");
        }else{
            try{
                throw new WordNotFound();
            }catch (WordNotFound e){
                e.disp();
            }
        }
    }
}

class WordNotFound extends RuntimeException{
    void disp(){
        System.out.println("Given Word is not present in String");
    }
}