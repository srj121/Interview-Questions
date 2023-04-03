package main;
//wait(): This method causes the current thread to wait until another thread notifies it to wake up.
// The wait() method must be called from within a synchronized block or method.
public class Implementation_For_Wait {
    public static void main(String[] args) {

    Object lock = new Object();          // Create a shared object

    Thread t1 = new Thread(new Cat(lock));    // Create a thread that waits for the lock to be notified
        t1.start();

    try {
        Thread.sleep(1000);
    }
    catch (InterruptedException e) {
        e.printStackTrace();
    }
    synchronized (lock){        // Notify the lock and wake up the waiter thread
        lock.notify();
        }
    }
}
//................................................................................................
class Dog implements Runnable{
    private Object lock;

   public Dog(Object lock){
       this.lock= lock;
   }
    @Override
    public void run() {
    synchronized (lock){
        System.out.println("Waiter thread started waiting...");

        try {
            lock.wait();
        }
        catch (InterruptedException e) {
          e.printStackTrace();
            }
            System.out.println("Waiter thread finished waiting...");
        }
    }
}


