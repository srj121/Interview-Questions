package main;

public class Implementation {

//    private static  int counter = 0;      //>>>> //uncomment this and run first
                                                //it is in the cache memory
    private static volatile int counter = 0; //volatile keyword will let the thread change the content directly
     public static void main(String[] args) {

    Thread t1 = new Thread(()->{
    int localCounter = counter;

    while (localCounter < 10){
        if (localCounter != counter){  // if not equals to then printing
            System.out.println("[T1] local counter is changed");
            localCounter  = counter;
        }
    }

    });

    Thread t2 = new Thread(()->{
        int localCounter = counter;
        while (localCounter < 10){
            System.out.println("[T2] Incremented counter to" + (localCounter + 1)); //adding 1 to count
            counter = ++localCounter;

            try {
                Thread.sleep(500);          //waiting for a certain time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    });
    t1.start();            //starting the Thread
    t2.start();             //starting the Thread
    }
}
