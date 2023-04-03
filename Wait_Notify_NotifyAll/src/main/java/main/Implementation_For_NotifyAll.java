package main;

public class Implementation_For_NotifyAll {

    public static void main(String[] args) {
        Object lock = new Object();

        Thread t1 = new Thread(new Cat(lock));          // Create three threads that wait for the lock to be notified
        Thread t2 = new Thread(new Cat(lock));
        Thread t3 = new Thread(new Cat(lock));

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        synchronized (lock){         // Notify all threads waiting on the lock and wake them up
            lock.notifyAll();
        }
    }
}
    class Cat implements Runnable{
        private Object lock;
        public Cat(Object lock){
            this.lock=lock;
        }
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName()+" Started Waiting ");

                try {
                    lock.wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" Finished Waiting");
            }
        }
    }


