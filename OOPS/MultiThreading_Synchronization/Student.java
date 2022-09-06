package MultiThreading_Synchronization;

public class Student extends Thread{
    Teacher ref;  //HAS A relation.....
    String sname;
    Student(String name,Teacher s){
        ref=s;
        sname=name;
    }
    @Override
    public void run(){
        ref.askQuestion(sname);
    }
}
