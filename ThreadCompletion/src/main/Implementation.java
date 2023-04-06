package main;

 interface RunnableCallback {
    void onComplete(String threadName);  // creating a abstract method
 }
class MyRunnable implements Runnable{
     private  RunnableCallback callback;
    private Thread thread;

    MyRunnable( String name,RunnableCallback callback){
        this.callback=callback;
        thread  = new Thread(this,name);  //taking thread name and passing into the string
    }

    @Override
    public void run() {

        if (callback != null) {
            callback.onComplete(thread.getName());   //get the name of thread
        }
    }
    public void start() {
        thread.start();
    }
    public void join() throws InterruptedException {
        thread.join();
    }
}

public class Implementation {
    public static void main(String[] args) throws InterruptedException {

        //lambda example
        MyRunnable myRunnable1 = new MyRunnable("Thread 1", threadName -> System.out.println(threadName + " Completed its execution."));

        //normal example
        MyRunnable myRunnable2 = new MyRunnable("Thread 2", new RunnableCallback() {
            @Override
            public void onComplete(String threadName) { //getting name of the thread
                System.out.println(threadName + " Completed its execution.");
            }

        });
        //starting both the thread
        myRunnable1.start();
        myRunnable2.start();

        try {
            //joining so they can run one after the other
            myRunnable1.join();
            myRunnable2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//you can check that if the other thread is started to run that means first thread is done running
//through call back we are getting the name of the current thread and pass it to the Oncomplte() method


