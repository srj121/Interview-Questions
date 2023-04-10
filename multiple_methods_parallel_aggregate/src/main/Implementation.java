package main;

import java.util.ArrayList;
import java.util.List;

public class Implementation {

    //creating a inner class called Result
        private record Result(int value) { // we can do like this.. we are using record class // came in java 16


//        private static class Result {
//
//            private final int value;
//
//            public Result(int value){  // we can do it the old school way
//                this.value=value;
//            }
//            public int getValue() {
//                return value;
//            }
//        }

    }
    //creating multiple methods for execution

    private static Result executeMethod1() {
        return new Result(1);
    }
    private static Result executeMethod2() {
        return new Result(2);
    }
    private static Result executeMethod3() {
        return new Result(3);
    }

    public static void main(String[] args) throws InterruptedException {
        //this list will store all the results in it
        List<Result> results = new ArrayList<>();
        //this list will store all the methods in it
        List<Runnable> methods = new ArrayList<>();

        methods.add(()->{

            Result result1 =  executeMethod1();
            results.add(result1);
        });
        methods.add(()->{

            Result result2 =  executeMethod2();
            results.add(result2);
        });
        methods.add(()->{

            Result result3 =  executeMethod3();
            results.add(result3);
        });

        //this list will store all the threads in it
        List<Thread> threads = new ArrayList<>();

        for (Runnable method : methods){
            Thread thread = new Thread(method);
            threads.add(thread);
            thread.start(); //starting thread
        }

        for (Thread thread : threads){
            thread.join(); //joining the threads
        }

        System.out.println("Results: ");
        for(Result result : results){
            System.out.println("method " + result.value() + " executed");
        }
    }

}
