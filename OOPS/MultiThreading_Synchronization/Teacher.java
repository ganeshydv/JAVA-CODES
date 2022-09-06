package MultiThreading_Synchronization;

public class Teacher {
     synchronized void askQuestion(String name){

        System.out.println(name+" is asking question...");
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
         System.out.println("end.......");

    }
}
