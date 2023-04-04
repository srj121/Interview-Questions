import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.instrument.Instrumentation;

class ObjectSizeFetcher{

    //Create a class that implements the java.lang.instrument.Instrumentation interface.
    // This will allow you to get the size of objects in your Java application
    private static volatile Instrumentation instrumentation;

    public static void preMain(String args, Instrumentation inst){
        instrumentation = inst;
    }

    public static long getObjectSize(Object obj){
        if(instrumentation == null){
            throw new IllegalStateException("Instrument is null");
        }
        return instrumentation.getObjectSize(obj);
    }

}


public class Implementation {
    public static void main(String[] args) throws IOException {
    Object ob = new Object();
    long size = ObjectSizeFetcher.getObjectSize(ob);

    // call the getObjectSize() method of the ObjectSizeFetcher class,
        // passing in the object whose size you want to get.

        System.out.println("Size of myObject: " + size + " bytes");

    }
}

//Note that the size returned by getObjectSize() may not be an exact measure of the object's size,
// due to factors such as padding and object headers.
// However, it can give you a good estimate of the object's size.