package ExceptionHandling_try_catch_;

public class Exception1_Arithmatic {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println(1/0);
        }catch (ArithmeticException e){
            System.out.println("dividing a number by zero is inavalid");
        }finally {
            System.out.println("end");
        }

    }

}
