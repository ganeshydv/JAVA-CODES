package ExceptionHandling_try_catch_;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class Exception2_throws_ {
    public static void main(String[] args) {
        System.out.println("start");
        Exception2_throws_ ref=new Exception2_throws_();
        try {
//            ref.disp();
            System.out.println("hi");
            ref.read_file();
//        }catch (RuntimeException e){
//            System.out.println("dividng a number by zero is invalid");
//
        }catch (FileNotFoundException f){
            System.out.println("such file doesn't exists");
        }
        System.out.println("end");

    }
    void disp(){
        System.out.println(1/0);
    }
    void read_file() throws FileNotFoundException{   //checked exception
        FileReader fs= new FileReader("java1223.txt");
    }
}
