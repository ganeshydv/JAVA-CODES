package Threads_;

public class Threads_methods_ {
    public static void main(String[] args) {
        Thread ts =new Thread();
        ts.setName("thread 1");
        ts.setPriority(5);
        System.out.println(ts.getId());
        System.out.println(ts.getName());
        System.out.println(ts.getPriority());
    }

}
