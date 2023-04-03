package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE)             //It is only usable on class only
//@Target(ElementType.METHOD)           //It is only usable on Methods only
@Target({ElementType.TYPE, ElementType.METHOD}) //It is only usable on class asWell as Methods
@Retention(RetentionPolicy.RUNTIME)         //It will tell java to keep this program through the runtime, so other can look and use it will run it
//@Retention(RetentionPolicy.CLASS)         //It means that java will keep your annotation around through compilation but once your program actually starts up at runtime it'll get rid of it
//@Retention(RetentionPolicy.SOURCE)        //Java will get rid of this annotation even before the code is compiled { ex: @SuppressWarning }
public @interface VeryImportant {



}
