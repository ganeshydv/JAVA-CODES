package MultiThreading_Synchronization;

public class Solution {

    public static void main(String[] args) {

        Teacher tech=new Teacher();
        Student s1=new Student("A",tech);
        Student s2=new Student("B",tech);
        Student s3=new Student("C",tech);
        s1.start();
        s2.start();
        s3.start();

    }
}
