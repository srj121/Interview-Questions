package mainClass;

import Annotation.ImportantString;
import Annotation.RunImmediately;
import Annotation.VeryImportant;

@VeryImportant
public class Cat {

    @ImportantString
    public String name = "Billu";
//    @RunImmediately           // you can  write this but your annotation should have a default parameter
    @RunImmediately(times = 3)
    public void meow(){
        System.out.println("meow meow meow");
    }

    public void eat(){
        System.out.println("cat is eating");
    }

}
