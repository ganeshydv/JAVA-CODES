import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Find_leap_and_save_in_file {
    public static void main(String[] args) throws IOException {
//        int year=2002;
//        System.out.println(check_leap(year));
        System.out.println("enter year :");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean isLeap=check_leap(year);
//        ArrayList<String> lst=new ArrayList<>();
//        File f1=new File("leap_year.txt");
//        FileOutputStream f1=new FileOutputStream("leap_year.txt"); //other option only for character
//        if(f1.createNewFile()){
//            System.out.println("file created "+ f1.getName());
//        }else {
//            System.out.println("file already exist..");
//        }
        if(isLeap){
//            lst.add(0,year+" leap year");
            FileWriter fw=new FileWriter("leap_year.txt");
//            FileOutputStream fw=new FileOutputStream("leap_year.txt"); //only for characters
            fw.write(year+" : leap year");
//            fw.write(lst.toString());
            fw.close();
            System.out.println("successfully added to file....");
        }

    }

    static boolean check_leap(int year){
        if(year%400==0){
            return true;
        } else if (year%4==0 && year%100!=0) {
            return true;
        }
        return false;
    }
}
