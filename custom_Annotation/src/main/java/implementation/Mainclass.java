package implementation;

import Annotation.ImportantString;
import Annotation.RunImmediately;
import Annotation.VeryImportant;
import mainClass.Cat;
import mainClass.Dog;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Mainclass {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat();
        Dog dog = new Dog();

        if(cat.getClass().isAnnotationPresent(VeryImportant.class)){    //we are checking if the annotation is used or not on the class level
            System.out.println("This thing is very Important ;)");
        }
        else {
            System.out.println("This thing is not very Important :(");
        }

        for(Method method : cat.getClass().getDeclaredMethods()){       //looping through the methods
            if(method.isAnnotationPresent(RunImmediately.class)){       // if it is using the annotation it will be invoked

                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for(int i = 0; i < annotation.times(); i++){   //looping it the times mentioned in the parameter

                    method.invoke(cat);
                }
            }
        }
        for(Field field : cat.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(ImportantString.class)){
                Object objectValue = field.get(cat);            //casting to a String

                if(objectValue instanceof String stringValue){      //if the variable value is a instance of a String we will  get cast to object {Safely}
                    System.out.println(stringValue.toUpperCase());  // printing out the variable in UPPER CASE
                }
            }
        }
    }
}
