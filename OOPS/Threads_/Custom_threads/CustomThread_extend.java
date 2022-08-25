package Threads_.Custom_threads;

public class CustomThread_extend {
    public static void main(String[] args) {
        custom_thread td=new custom_thread();
        td.start();
    }
}
class custom_thread extends Thread{
    @Override
    public void run(){
        System.out.println("hello");
        for (int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}