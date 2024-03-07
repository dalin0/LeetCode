package hot100.test;

class Num implements Runnable{

    private int num = 1;
    @Override
    public void run() {
        while(true){
            synchronized(this){
                notify();
                if(num <= 100){
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}


public class Test6 {
    public static void main(String[] args) {
        Num num = new Num();
        Thread thread1 = new Thread(num);
        Thread thread2 = new Thread(num);
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }
}
