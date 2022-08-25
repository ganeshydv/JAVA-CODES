package Threads_.Custom_threads;

public class Custom_thread_implements {
    public static void main(String[] args) {
        Thread td=new Thread(new CustomThread_implement());
        td.start();
    }
}
class CustomThread_implement implements Runnable{
    @Override
    public void run(){
        System.out.println("creating new thread");
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}
