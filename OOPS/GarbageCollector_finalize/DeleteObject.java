package GarbageCollector_finalize;

public class DeleteObject {

    @Override
    protected void finalize(){
//        Student s=new Student();
//        s.disp();
        System.out.println("deleting Student class object reference");
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.disp();
        s=null;
        System.gc();
    }
}
class Student{
    String name="a";
    void disp(){
        System.out.println("student name:"+name);
    }

}