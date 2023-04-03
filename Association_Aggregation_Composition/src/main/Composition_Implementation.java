package main;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class Engine{
    public void start(){
        System.out.println("Engine started");
    }
    public void stop(){
        System.out.println("Engine Stopped");
    }
}

class Wheel{
    AtomicInteger atomicInteger = new AtomicInteger(1);
    public void rotate() {
        for(int i = 0; i< 4; i++) {
            System.out.println(atomicInteger.getAndIncrement() + " Wheel is rotating ");
        }
        System.out.println(" Wheel is rotating ");
    }
}

class Car{
    private Engine engine;
    private Wheel[] wheels;

    Car(){
        this.engine= new Engine();
        this.wheels = new Wheel[4];

        for(int i = 0; i< wheels.length;i++){
            wheels[i] = new Wheel();
        }
    }
    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }
    public void rotateWheel() {
        new Wheel().rotate();
    }
}

public class Composition_Implementation {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.rotateWheel();
        car.stop();
    }

    //Composition is a stronger form of aggregation, where one class contains or owns one or more instances of another class,
    // and the contained objects cannot exist independently of the containing object.
    // Composition represents a "part-of" relationship, where the contained objects are parts of the containing object.

}
