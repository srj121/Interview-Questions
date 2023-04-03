package Annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunImmediately {
//    int times();      //you can use this way, but you have to specify everytime you use the annotation
    int times() default 1;      // this way you don't have to mention compulsorily
                                //you can't use just any type you want for these parameters they can
                                // only be a primitive type like this int a class type a string or an array of those

}
