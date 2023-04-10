package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Cat");
        list.add("Dog");
        list.add("horse");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(list);
            list.remove(animal);    // This modification won't affect the iteration
        }

        //CopyOnWriteArrayList is a thread-safe variant of ArrayList in Java.
        //that it creates a new copy of the underlying array every time a modification is made.
        //multiple threads can read from the list simultaneously without blocking each other,
        //modifications are made in a separate copy of the array. Once the modification is complete, the new copy of the array is published,
        // replacing the old one, and subsequent reads will access the new copy.
    }
}
