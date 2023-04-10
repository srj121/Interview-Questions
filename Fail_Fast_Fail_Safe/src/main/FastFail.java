package main;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class FastFail {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Cat");
        list.add("Dog");
        list.add("horse");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {

                String animal = iterator.next();

                System.out.println(list);
                list.remove(animal);  //if we do this it will give a ConcurrentModificationException


                if (animal.equals("Dog")) {
                    iterator.remove(); // Safe way to remove an element while iterating
                }
                                    //because the data is changing
                                        // this is fast fail iterator
            // occurs when a collection is modified while it is being iterated over.
            // It is typically thrown by fail-fast iterators, which detect any modifications made to the collection outside the iterator,
            // and indicate that the state of the collection has been changed unexpectedly.


        }
    }
}
