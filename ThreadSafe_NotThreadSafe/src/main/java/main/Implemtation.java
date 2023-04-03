package main;

import java.util.concurrent.atomic.AtomicInteger;

public class  Implemtation {

//    int count;
    AtomicInteger count = new AtomicInteger();
    public  void  increment(){  // public synchronized void  increment(){  // you cna use this on the method level
                                                                           // so every thread can run one after the other
//        count++;

        count.incrementAndGet();        //this will increment the count
    }


    public static void main(String[] args) throws InterruptedException {

        Implemtation imp = new Implemtation();

        Thread t1 = new Thread(new Runnable() {

            public void run() {
                for (int i =1; i <=1000; i++){

                    imp.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {

            public void run() {
                for (int i =1; i <=1000; i++){

                    imp.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(imp.count);
    }

}
